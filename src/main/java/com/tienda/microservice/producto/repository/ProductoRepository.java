package com.tienda.microservice.producto.repository;

import org.aspectj.apache.bcel.util.Repository;

import com.tienda.microservice.producto.model.Producto;

public interface ProductoRepository {

	public Producto saveProducto(Producto producto);

	public void updaProducto(Producto producto);

	public void deleteProducto(String IdProducto);

}
