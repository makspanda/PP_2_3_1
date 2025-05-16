package dao;

import model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao {
    @Transactional
    List<User> getUsers();
    @Transactional
    void addUser(User user);
    User findUser(Long id);
    @Transactional
    void deleteUser(Long id);
}
