package com.example.talentme.telentme.controller;

import com.example.talentme.telentme.model.User;
import com.example.talentme.telentme.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserRepository userRepo;

    public UserController(UserRepository userRepo) {
        super();
        this.userRepo=userRepo;
    }

    @GetMapping("/user")
    Collection<User> user(){
        return userRepo.findAll();
    }

    @PostMapping("/user")
    ResponseEntity<?> addUser(@Validated @RequestBody User user) throws URISyntaxException {
        User result = userRepo.save(user);
        return ResponseEntity.created(new URI("/api/user"+result.getId())).body(result);
    }

    @GetMapping("/user/{id}")
    ResponseEntity<?> getByUserId(@PathVariable long id) {
        Optional<User> user = userRepo.findById(id);
        return user.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
