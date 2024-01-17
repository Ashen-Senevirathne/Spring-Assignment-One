package com.fidenz.assignmentone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private Long id;
    private String userName;
    private String password;
}
