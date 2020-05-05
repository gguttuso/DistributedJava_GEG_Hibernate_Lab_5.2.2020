package edu.wctc;

import edu.wctc.entity.Item;
import edu.wctc.entity.ItemDetail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SearchServlet2", urlPatterns = "/search2")
public class SearchServlet2 extends HttpServlet {

    private final String DRIVER_NAME = "jdbc:derby:";
    private final String DATABASE_PATH = "../../db";
    private final String SCHEMA = "brie";
    private final String PASSWORD = "000547631";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            String searchTerm = request.getParameter("item");

            // Load the driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            // Find the absolute path of the database folder
            String absPath = getServletContext().getRealPath("/") + DATABASE_PATH;

            // Build the query as a String
            StringBuilder sql = new StringBuilder("select name, size ");
            sql.append("from item ");
            sql.append("join item_detail on (item.item_id = item_detail.item_id)");
            sql.append("where name = ?"); // Don't end SQL with semicolon!

            // Create a connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, SCHEMA, PASSWORD);
            // Create a statement to execute SQL
            pstmt = conn.prepareStatement(sql.toString());
            // Fill the prepared statement params
            pstmt.setString(1, searchTerm);
            // Execute a SELECT query and get a result set
            rset = pstmt.executeQuery();

            List<Item> itemList = new ArrayList<Item>();

            // Loop while the result set has more rows
            while (rset.next()) {
                Item item = new Item();
                item.setName(rset.getString(1));
//                pet.setAge(rset.getInt(2));

                ItemDetail detail = new ItemDetail();
                item.setDetail(detail);

                detail.setSize(rset.getDouble(2));
                itemList.add(item);
            }

            request.setAttribute("item", itemList);
            request.getRequestDispatcher("view/search2.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException e) {
            // If there's an exception locating the driver, send IT as the response
            response.getWriter().print(e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseUtils.closeAll(conn, pstmt, rset);
        }


    }
}
