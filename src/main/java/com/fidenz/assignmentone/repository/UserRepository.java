package com.fidenz.assignmentone.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class UserRepository implements IUserRepository {

    @Override
    public String getData() {
        return "Get Default Data";
    }
}
