package com.test5.test5.controller;

import com.test5.test5.entity.User;
import com.test5.test5.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService patientService;

    @RequestMapping("/abc")
    public Animal getName(){
        return new Animal("bear",12);
    }

    @RequestMapping("/abcd")
    public List<User> getUser(){
        return patientService.findAll();
    }
}
