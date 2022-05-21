package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveUser(User user);

    List<User> listUsers();

    User getUserById(long id);

    void deleteUser(long id);

    Optional<User> findByEmail(String email);
}
