package com.example.talentme.telentme.controller;

import com.example.talentme.telentme.model.User;
import com.example.talentme.telentme.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserRepository userRepo;

    public UserController(UserRepository userRepo) {
        super();
        this.userRepo=userRepo;
    }



}
