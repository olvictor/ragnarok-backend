package com.example.ragnarokapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lojas")
public class lojasController {
    @GetMapping
    public  String buscarLojas (){
        return "AAAAAAAAAAAAAAAAA";
    }
}