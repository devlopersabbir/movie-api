package com.devlopersabbir.movieapi.controllers;
import com.devlopersabbir.movieapi.entity.User;
import com.devlopersabbir.movieapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> index(){
        return userService.getAllUsers();
    }
    @PostMapping("/")
    public void createUser(@RequestBody User user){
        System.out.println(user);
    }
}
