package service;

import model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    void deleteUser();
    List<User> getUsers();
    void editUser();
}
