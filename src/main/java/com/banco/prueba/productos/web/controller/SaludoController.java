package com.banco.prueba.productos.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.prueba.productos.domain.model.Producto;
import com.banco.prueba.productos.domain.service.ProductoService;

@RestController
@RequestMapping("/saludar")
public class SaludoController {

    @Autowired
    private ProductoService productoService;
    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo Carlos1";
    }
    
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public Producto getProduct(@PathVariable("id") int productId) {
        return productoService.recuperarProducto();
    }

}
