package dao;

import model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createUser(User user) {
        entityManager.persist(user);

    }

    @Override
    public void deleteUser() {

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        return (List<User>) entityManager.createQuery("select u FROM User u");
    }

    @Override
    public void editUser() {

    }
}