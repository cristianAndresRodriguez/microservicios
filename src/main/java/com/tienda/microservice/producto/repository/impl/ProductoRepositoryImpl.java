package com.tienda.microservice.producto.repository.impl;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.tienda.microservice.producto.model.Producto;
import com.tienda.microservice.producto.repository.ProductoRepository;

@Repository
public class ProductoRepositoryImpl implements ProductoRepository {
	
	 private MongoOperations mongoOperations;

	public ProductoRepositoryImpl(MongoOperations mongoOperations) {
	        Assert.notNull(mongoOperations);
	        this.mongoOperations = mongoOperations;
	    }

	@Override
	public Producto saveProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updaProducto(Producto producto) {
		 this.mongoOperations.save(producto);
		
	}

	@Override
	public void deleteProducto(String IdProducto) {
		// TODO Auto-generated method stub
		
	}

	

}
