package com.taslim.jpa.controller;


import com.taslim.jpa.model.User;
import com.taslim.jpa.repository.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserJPARepository userJPARepository;


    @GetMapping(value = "/all")
    public List<User> findAll(){
        return userJPARepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public User findByName(@PathVariable final String name){
        return userJPARepository.findByName(name);
    }

    @PostMapping(value = "/user")
    public User saveUser(@RequestBody final User user){
        userJPARepository.save(user);
        return userJPARepository.findByName(user.getName());
    }
}
