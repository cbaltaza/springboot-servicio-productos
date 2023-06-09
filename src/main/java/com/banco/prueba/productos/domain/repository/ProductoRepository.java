/**
 * 
 */
package com.banco.prueba.productos.domain.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.banco.prueba.productos.domain.model.Producto;

/**
 * @author BalMen
 *
 */
public interface ProductoRepository extends CrudRepository<Producto, Long> {

	Optional<Producto> findByProductId(String id);

}
