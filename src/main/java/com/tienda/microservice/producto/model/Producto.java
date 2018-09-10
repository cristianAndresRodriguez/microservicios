package com.tienda.microservice.producto.model;

import java.io.Serializable;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Clase que representa a un producto en el sistema.
 * 
 * @autor cristian andres Rodriguez Ortega
 * @version 0.0.1.
 * @date 07/09/2018
 */
@Document(collection = "producto")
@JsonPropertyOrder({ "productoId", "name", "precio" })
public class Producto implements Serializable {

	private static final long serialVersionUID = -7788619177798333712L;

	/** Atributo que representa el identificador del producto */
	@Id
	@NonNull
	private String productoId;

	/** Atributo que representa el nombre del producto */
	@NonNull
	private String nombre;

	/** Atributo que representa el precio del producto */
	@NonNull
	private double precio;

	/**
	 * Devuelve un identificador del producto
	 */
	public String getProductoId() {
		return productoId;
	}

	/**
	 * Establece el identificador para el producto
	 */
	public void setProductoId(String productoId) {
		this.productoId = productoId;
	}

	/**
	 * Devuelve el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece un nombre para el producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece un precio para el producto
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
