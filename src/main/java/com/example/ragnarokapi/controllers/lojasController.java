package com.example.ragnarokapi.controllers;

import com.example.ragnarokapi.models.Lojas.Vendings;
import com.example.ragnarokapi.models.Lojas.LojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lojas")
public class lojasController {
    @Autowired
    private LojasRepository repository;
    @GetMapping
    public List <Vendings> buscarLojas (){
        List<Vendings> listaDeLojas = repository.findAll();
        return listaDeLojas;
    }
}