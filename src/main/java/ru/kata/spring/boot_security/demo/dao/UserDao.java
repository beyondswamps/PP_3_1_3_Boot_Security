package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Long id);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUserByUsername(String username);
}
