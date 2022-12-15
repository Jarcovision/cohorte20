package com.generation.jlsg.myappdb.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")

public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String correo;
	private Integer prioridad;
	
	/**********relaciones**********/
	@OneToMany (mappedBy = "usuario") //Un usuario con muchos productos
	private ArrayList<ProductosModel> productos;	
	
	@OneToMany (mappedBy = "usuario") //Un usuario con muchos productos
	private ArrayList<OrdenesModel> ordenes;	
	/********************/

	//Constructor vacío
	public UsuarioModel() { 
	}

	//Constructor sobrecargado
	public UsuarioModel(Long id, String nombre, String correo, Integer prioridad) { 
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.prioridad = prioridad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public ArrayList<ProductosModel> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductosModel> productos) {
		this.productos = productos;
	}

	public ArrayList<OrdenesModel> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(ArrayList<OrdenesModel> ordenes) {
		this.ordenes = ordenes;
	}

	
	
}
