package com.crud.user.service;

import com.crud.user.model.User;
import com.crud.user.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(int userId) {
        User user;
        try {
            user = userRepository.findById(userId).get();
        } catch (Exception exception) {
            user = null;
        }
        return user;
    }
}
