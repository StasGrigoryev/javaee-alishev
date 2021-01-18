package org.example.javaeetest;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    List<User> users = new ArrayList<>();
    private static int USER_COUNT = 0;
    private static final UserDAO USERDAO_INSTANCE = new UserDAO();

    public static UserDAO getUserDAO() {
        return USERDAO_INSTANCE;
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(int id) {
        return users.stream().
                filter(user -> user.getId() == id).
                findAny().
                orElse(null);
    }

    public void save(User user) {
        user.setId(++USER_COUNT);
        users.add(user);
    }
}
