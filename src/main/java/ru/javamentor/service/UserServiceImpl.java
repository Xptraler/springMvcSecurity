package ru.javamentor.service;

import org.springframework.data.jpa.repository.Modifying;
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
    @Transactional
    @Modifying
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return userDao.getUsers();

    }

    @Override
    @Transactional
    public User getUser(int id) {
       return userDao.getUser(id);

    }

    @Override
    @Transactional
    @Modifying
    public void update(int id, User user) {
        userDao.update(id,user);
    }
}
