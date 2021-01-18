package org.example.javaeetest.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/javaee_db",
                    "stas", "stas");

            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select author || ' - ' || title AS result_string " +
                    "from books");

            pw.println("Books:\n");
            while (rs.next()) {
                pw.println(rs.getString(1));
            }
            stm.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
