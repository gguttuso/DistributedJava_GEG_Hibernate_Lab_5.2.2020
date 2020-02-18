package edu.wctc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet2", urlPatterns = "/list2")
public class ListServlet2 extends HttpServlet {

    private final String DRIVER_NAME = "jdbc:derby:";
    private final String DATABASE_PATH = "../../db";
    private final String USERNAME = "brie";
    private final String PASSWORD = "000547631";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Declare outside the try/catch so the variables are in scope in the finally block
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            // Load the driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            // Find the absolute path of the database folder
            String absPath = getServletContext().getRealPath("/") + DATABASE_PATH;

            StringBuilder sql = new StringBuilder("SELECT item_id, name");
            sql.append(" FROM item");
            sql.append(" ORDER BY item_id"); // Don't end SQL with semicolon!

            // Create a connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, USERNAME, PASSWORD);
            // Create a statement to execute SQL
            stmt = conn.createStatement();
            // Execute a SELECT query and get a result set
            rset = stmt.executeQuery(sql.toString());

            List<Item> itemList = new ArrayList<Item>();

            // Loop while the result set has more rows
            while (rset.next()) {
                Item pet = new Item();
                item.setId(rset.getInt(1));
                item.setName(rset.getString(2));
                itemList.add(item);
            }

            request.setAttribute("items", itemList);
            request.getRequestDispatcher("search2.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException e) {
            // If there's an exception locating the driver, send IT as the response
            response.getWriter().print(e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseUtils.closeAll(conn, stmt, rset);
        }

    }
}
