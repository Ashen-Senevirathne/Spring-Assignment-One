package com.fidenz.assignmentone.repository;

import com.fidenz.assignmentone.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository implements IUserRepository {

    private final Map<Long, User> userMap = new HashMap<>();

    UserRepository(){
        userMap.put(1L, new User(1L, "john_doe", "password123"));
        userMap.put(2L, new User(2L, "jane_smith", "pass456"));
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(userMap.get(id));
    }
}
