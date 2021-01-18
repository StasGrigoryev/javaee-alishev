package org.example.javaeetest.servlets;

import org.example.javaeetest.Cart;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class MyServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session == null) {
            session = req.getSession();
        }
        // at the start getAttribute() returns null, we set it to 1
        // second time user calls get method it will contain attribute
        // from the previous session + 1
        Integer count = (Integer) session.getAttribute("count");

        if (count == null)
            session.setAttribute("count", 1);
        else
            session.setAttribute("count", ++count);

        Cart cart = (Cart) session.getAttribute("cart");

        String name = req.getParameter("name");
        String quantity = req.getParameter("quantity");

        if(cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(Integer.parseInt(quantity));
        }
        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req, resp);

    }

}
