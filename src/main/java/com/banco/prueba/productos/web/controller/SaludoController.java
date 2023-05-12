package com.banco.prueba.productos.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class SaludoController {
    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo Carlos1";
    }
}
