package dao;

import model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    void addUser(User user);
    User findUser(Long id);
    void deleteUser(Long id);
}
