package com.example.adminapp.service;


import com.example.adminapp.entity.Login;
import com.example.adminapp.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {
    @Autowired
    private LoginRepo repo;

    public Login login(String username, String password) {
        Login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }

}