package com.bankmanagement.service;

import com.bankmanagement.model.Bank;
import com.bankmanagement.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    Optional<User> updateUser(Long id, User updatedUser);
    void deleteUser(Long id);
}