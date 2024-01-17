package com.fidenz.assignmentone.controller;

import com.fidenz.assignmentone.model.User;
import com.fidenz.assignmentone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id){
        Optional<User> userOptional = userService.getUserById(id);

        return userOptional.map(user -> "Username: " + user.getUserName() + ", Password: " + user.getPassword())
                .orElse("User not found");
    }

}
