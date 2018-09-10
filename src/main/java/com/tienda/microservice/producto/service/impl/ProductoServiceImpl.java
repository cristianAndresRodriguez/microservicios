package com.tienda.microservice.producto.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.microservice.producto.model.Producto;
import com.tienda.microservice.producto.repository.ProductoRepository;
import com.tienda.microservice.producto.service.ProductoService;

@Service("ProductoService")	
@Transactional
public class ProductoServiceImpl implements ProductoService {
	   private ProductoRepository productoRepository;
	   
	@Override
	public void updateProducto(Producto producto) {
	
		productoRepository.updaProducto( producto);
	}

}
