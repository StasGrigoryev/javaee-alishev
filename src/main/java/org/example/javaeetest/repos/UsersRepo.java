package org.example.javaeetest.repos;

import org.example.javaeetest.models.User;

import java.util.List;

public interface UsersRepo {
    List<User> findAll();
}
