package ru.javamentor.dao;

import org.hibernate.Session;
import ru.javamentor.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void createUser(User user) {
       Session session = entityManager.unwrap(Session.class);
       session.persist(user);

    }

    @Override
    public void deleteUser() {

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUsers() {

        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("SELECT User from User ", User.class);
        return (List<User>) query.getResultList();
    }

    @Override
    public void editUser() {

    }
}