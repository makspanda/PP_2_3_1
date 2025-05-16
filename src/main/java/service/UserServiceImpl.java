package service;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User findUser(Long id) {
        return userDao.findUser(id);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
