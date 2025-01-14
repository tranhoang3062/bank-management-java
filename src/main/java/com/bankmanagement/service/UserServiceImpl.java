package com.bankmanagement.service;

import com.bankmanagement.model.Bank;
import com.bankmanagement.model.User;
import com.bankmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> updateUser(Long id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setBank_account_name(updatedUser.getBank_account_name());
            user.setBank_account_number(updatedUser.getBank_account_number());
            user.setPhone_number(updatedUser.getPhone_number());
            user.setEmail(updatedUser.getEmail());
            user.setBalance(updatedUser.getBalance());
            return userRepository.save(user);
        });
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
