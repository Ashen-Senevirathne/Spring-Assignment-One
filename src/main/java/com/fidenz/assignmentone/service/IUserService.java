package com.fidenz.assignmentone.service;

import com.fidenz.assignmentone.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> getUserById(Long id);
}
