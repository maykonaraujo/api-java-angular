package com.br.dev.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.dev.api.models.Home;

@RestController
public class HomeController {
    @GetMapping("/")
    public Home index(){
        return new Home();
    }

    
}