package ru.javamentor.service;

import ru.javamentor.dao.UserDao;
import ru.javamentor.dao.UserDaoImpl;
import ru.javamentor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;


    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Transactional
    @Override
    public void createUser(User user) {
        userDao.createUser(user);

    }

    @Override
    public void deleteUser() {

    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return userDao.getUsers();

    }

    @Override
    public void editUser() {

    }
}
