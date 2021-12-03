package com.softakcess.user.service;

import com.softakcess.user.dao.request.UserRegistrationRequest;
import com.softakcess.user.model.User;
import com.softakcess.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public void registerUser(UserRegistrationRequest request){
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        //todo: check if email is valid
        //todo: check if email is not taken
        userRepository.save(user);
    }
}
