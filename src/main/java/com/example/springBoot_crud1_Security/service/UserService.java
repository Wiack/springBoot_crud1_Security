package com.example.springBoot_crud1_Security.service;

import com.example.springBoot_crud1_Security.model.User;

import java.security.Principal;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUserById(Long id, Principal principal);

    void updateUser(User user);

    User getById(Long id);

    User getByEmail(String email);

}
