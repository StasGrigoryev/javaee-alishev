package org.example.javaeetest.servlets;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Cookie cookie1 = new Cookie("user_id","321");
    cookie1.setMaxAge(24 * 60 * 60);
    Cookie cookie2 = new Cookie("user_name","Nhoj");
    cookie1.setMaxAge(24 * 60 * 60);

    resp.addCookie(cookie1);
    resp.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
