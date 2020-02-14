package edu.wctc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "Servlet", urlPatterns = "/list_old")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            String absPath = getServletContext().getRealPath("/") + "../../db";

            conn = DriverManager.getConnection("jdbc:derby:" + absPath,
            "gguttuso",
            "000547631");

            stmt = conn.createStatement();
            rset = stmt.executeQuery("select name, age, species_name from pet");

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
