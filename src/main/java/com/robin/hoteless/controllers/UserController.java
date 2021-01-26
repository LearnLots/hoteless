package com.robin.hoteless.controllers;

import com.robin.hoteless.model.User;
import com.robin.hoteless.repository.UserRepository;
import com.robin.hoteless.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/new")
    public User createUser(@RequestBody User user) {
        try {
            this.userService.saveUser(user);
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }

}
