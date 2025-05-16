package dao;

import model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User findUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(Long id) {
        User user = findUser(id);
        entityManager.remove(user);
    }
}
