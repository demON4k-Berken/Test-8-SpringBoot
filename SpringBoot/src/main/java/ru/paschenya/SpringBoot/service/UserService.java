package ru.paschenya.SpringBoot.service;


import ru.paschenya.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteUser(Long id);

    User findById(Long id);

    List<User> findAllUsers();
}

