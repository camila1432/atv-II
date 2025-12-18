package com.example.sweetimp.controller;

import com.example.sweetimp.model.User;
import com.example.sweetimp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return service.login(user.getEmail(), user.getPassword());
    }

    @PostMapping("/forgot")
    public void forgot(@RequestBody User user) {
        service.resetPassword(user.getEmail(), user.getPassword());
    }
}
