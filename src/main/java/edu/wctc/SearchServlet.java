package edu.wctc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "SearchServlet", urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;

        // the parameter must match the "name" in the html
        String speciesName = request.getParameter("species");

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            String absPath = getServletContext().getRealPath("/") + "../../db";

            conn = DriverManager.getConnection("jdbc:derby:" + absPath,
                    "gguttuso",
                    "000547631");

            // the question mark is a placeholder of what the user inputs
            String sql = "select name, age, species_name from pet where species_name = ?";

            // pass the sql with user input -- this is for security purposes
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, speciesName);

            rset = stmt.executeQuery();

            // String Builder is like a container with all of our string pieces (concatenating without "+")
            StringBuilder sb = new StringBuilder("<html><body>");

            sb.append("<ul>");

            while(rset.next())
            {

                sb.append("<li>");
                String name = rset.getString("name");
                int age = rset.getInt("age");
                String species = rset.getString(3);
                sb.append(name + "," + age + ", " + species);
                sb.append("</li>");
            }

            sb.append("</ul>");
            sb.append("</body></html>");

            response.setContentType("text/html");
            response.getWriter().print(sb.toString());

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn,stmt,rset);
        }

    }

    public static void closeAll(Connection conn, Statement stmt, ResultSet rset) {
        if (rset != null) {
            try {
                rset.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    }

