package service;

import model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
    User findUser(Long id);
    void deleteUser(Long id);
}
