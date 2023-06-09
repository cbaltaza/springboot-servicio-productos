package com.banco.prueba.productos.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.prueba.productos.domain.model.Producto;
import com.banco.prueba.productos.domain.service.ProductoService;

@RestController
@RequestMapping("/saludar")
@CrossOrigin(origins = {"http://localhost:80", "http://localhost:4200", "http://localhost:8080", "http://localhost"})
public class SaludoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo Carlos1";
    }

    @GetMapping("/get/{id}")
    public Producto getProduct(@PathVariable("id") String productId) {
        return productoService.recuperarProducto(productId );
    }

    @GetMapping("/all")
    public List<Producto> getProductos() {
        return productoService.recuperarProductos();
    }

    @PostMapping("/salvar")
    public Producto guardarProducto(Producto producto) {
        return  productoService.guardarProducto(producto);
    }
}
