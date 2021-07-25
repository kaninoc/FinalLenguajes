package com.example.traductorfinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/traductor/")

public class traductorController {

    @GetMapping(value = "/all")
    public String getAll() {

        return "almacenamientoJson";
    }

    @PostMapping(value = "/traducir")
    public String saveAll(@RequestBody String consola) {

        return consola.toString();
    }

}
