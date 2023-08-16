package com.test5.test5.services;

import com.test5.test5.entity.User;
import com.test5.test5.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper patientMapper;

    public List<User> findAll(){
        return patientMapper.findAll();
    }
}
