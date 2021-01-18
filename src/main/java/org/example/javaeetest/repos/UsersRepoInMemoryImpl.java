package org.example.javaeetest.repos;

import org.example.javaeetest.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepoInMemoryImpl implements UsersRepo{
    private List<User> users;

    public UsersRepoInMemoryImpl() {
        this.users = new ArrayList<>();
        users.add(new User("Alex", "qwe", LocalDate.parse("1994-02-02")));
        users.add(new User("Mike", "asd", LocalDate.parse("1993-01-05")));
        users.add(new User("Justin", "zxc", LocalDate.parse("1995-05-10")));
    }

    public List<User> findAll() {
        return users;
    }

}
