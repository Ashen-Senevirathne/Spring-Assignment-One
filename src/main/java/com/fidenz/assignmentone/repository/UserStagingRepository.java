package com.fidenz.assignmentone.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("staging")
public class UserStagingRepository implements IUserRepository{
    @Override
    public String getData() {
        return "Get Staging Data";
    }
}
