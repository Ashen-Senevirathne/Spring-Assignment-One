package com.fidenz.assignmentone.repository;

import com.fidenz.assignmentone.model.User;

import java.util.Optional;

public interface IUserRepository {

    Optional<User> getUserById(Long id);
}