package com.softakcess.user.controller;

import com.softakcess.user.dao.request.UserRegistrationRequest;
import com.softakcess.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public void registerUser(@RequestBody UserRegistrationRequest userRegistrationRequest){
        log.info("new customer registration {}", userRegistrationRequest);
        userService.registerUser(userRegistrationRequest);
    }
}
