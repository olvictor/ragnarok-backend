package com.example.ragnarokapi.controllers;


import com.example.ragnarokapi.models.Lojas.LojasRepository;
import com.example.ragnarokapi.models.Users.User;
import com.example.ragnarokapi.models.Users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> getUsers(){
        List<User> listaUsuarios = repository.findAll();
        return  listaUsuarios;
    };
}