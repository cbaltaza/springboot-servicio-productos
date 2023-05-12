package com.banco.prueba.productos.web.controller;

import com.banco.prueba.productos.domain.model.Producto;
import com.banco.prueba.productos.domain.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/saludar")
public class SaludoController {

    @Autowired
    private ProductoService productoService;
    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo Carlos1";
    }
    @GetMapping("/{id}")
    public Producto getProduct(@PathVariable("id") int productId) {
        return productoService.recuperarProducto();
    }

}
