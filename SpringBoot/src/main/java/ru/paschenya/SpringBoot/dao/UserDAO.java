package ru.paschenya.SpringBoot.dao;

import ru.paschenya.SpringBoot.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User findById(Long id);

    List<User> findAllUsers();

}
