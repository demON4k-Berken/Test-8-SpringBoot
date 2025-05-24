package ru.paschenya.SpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.paschenya.SpringBoot.dao.UserDAO;
import ru.paschenya.SpringBoot.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> showAllUsers() {
        return userDAO.findAllUsers();
    }
}
