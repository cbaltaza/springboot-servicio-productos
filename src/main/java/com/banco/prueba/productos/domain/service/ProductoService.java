package com.banco.prueba.productos.domain.service;

import java.util.List;

import com.banco.prueba.productos.domain.model.Producto;

public interface ProductoService {

    /**
     *  recuperar Producto
     */
    Producto recuperarProducto(String id);
    
    /**
     *  recuperar Producto
     */
    List<Producto> recuperarProductos();

	/**
	 * @param producto
	 * @return
	 */
	Producto guardarProducto(Producto producto);
}
