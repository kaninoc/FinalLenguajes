package com.example.traductorfinal.controllers;

import com.example.traductorfinal.services.Conector;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/traductor/")

public class traductorController {

    @GetMapping(value = "/all")
    public String getAll() {

        return "almacenamientoJson";
    }

    @PostMapping(value = "/cadena")
    public String saveAll(@RequestBody String consola) {

        System.out.println(consola);
        Conector enlace = new Conector();
        String s = enlace.traducir(consola);
        System.out.println(s);
        return s;
    }

}
