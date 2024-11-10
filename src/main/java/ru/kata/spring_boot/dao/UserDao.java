package ru.kata.spring_boot.dao;

import ru.kata.spring_boot.model.User;

import java.util.List;


public interface UserDao {
    void add(User user);

    void removeUserById(long id);

    User getUserById(long id);

    void update(User user);

    List<User> listUsers();
}
