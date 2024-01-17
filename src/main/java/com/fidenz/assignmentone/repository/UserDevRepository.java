package com.fidenz.assignmentone.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("dev")
public class UserDevRepository implements IUserRepository{
    @Override
    public String getData() {
        return "Get Dev Data";
    }
}
