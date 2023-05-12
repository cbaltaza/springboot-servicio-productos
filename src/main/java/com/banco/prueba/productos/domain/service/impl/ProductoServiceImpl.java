package com.banco.prueba.productos.domain.service.impl;

import com.banco.prueba.productos.domain.model.Producto;
import com.banco.prueba.productos.domain.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductoServiceImpl implements ProductoService {


    @Override
    public Producto recuperarProducto() {
        Producto p = new Producto();

        p.setActive("Si");
        p.setName("Balta1");
        p.setCategoryId("Prueba");
        p.setStock("10");
        p.setProductId(LocalDateTime.now().toString());
        p.setPrice("100.00");
        return p;
    }
}
