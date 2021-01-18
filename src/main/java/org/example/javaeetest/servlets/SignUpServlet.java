package org.example.javaeetest.servlets;

import org.example.javaeetest.models.User;
import org.example.javaeetest.repos.UsersRepo;
import org.example.javaeetest.repos.UsersRepoInMemoryImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SignUpServlet extends HttpServlet {
    private UsersRepo usersRepo = new UsersRepoInMemoryImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = usersRepo.findAll();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
