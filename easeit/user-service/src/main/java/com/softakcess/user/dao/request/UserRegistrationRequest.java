package com.softakcess.user.dao.request;

import lombok.Data;

@Data
public class UserRegistrationRequest {
    String firstName;
    String lastName;
    String email;
}
