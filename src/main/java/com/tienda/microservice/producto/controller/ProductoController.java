package com.tienda.microservice.producto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.microservice.producto.model.Producto;
import com.tienda.microservice.producto.service.ProductoService;
/**
 * Clase que define el controlador para la pagina que manipula el producto.
 * 
 * @author Cristian Andres Rodriguez Ortega.
 * @update 07/09/2019
 */
@RestController
@RequestMapping("Producto")
public class ProductoController {

	    private final ProductoService productoService;
	    private Producto producto;
	    
	    public ProductoController(ProductoService productoService) {
	    	this.productoService = productoService;
	    }
}
	