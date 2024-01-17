package com.fidenz.assignmentone.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {

    @Override
    public String getData() {
        return "Get Default Data";
    }
}
