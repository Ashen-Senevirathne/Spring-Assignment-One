package com.fidenz.assignmentone.service;

import com.fidenz.assignmentone.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Value("${app.username}")
    private String username;

    @Value("${app.password}")
    private String password;

    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String getData() {
        return userRepository.getData() + "\n" + "Username: " + username + "\n" + "Password: " + password;
    }
}
