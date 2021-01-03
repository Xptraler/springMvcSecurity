package ru.javamentor.dao;

import ru.javamentor.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);
    void deleteUser();
    List<User> getUsers();
    void editUser();
}
