package ru.kata.spring_boot.service;

import ru.kata.spring_boot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void removeUserById(long id);

    User getUserById(long id);

    void update(User user);

    List<User> listUsers();
}
