package com.example.loginauthapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginauthapi.domain.user.User;
import com.example.loginauthapi.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User salvar(User usuario) {
        return repository.save(usuario);
    }
}