package com.generation.jlsg.myappdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")

public class ProductosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreProducto;
	
	/**********relaciones**********/
	@ManyToOne  //Muchos productos con un usuario
	private UsuarioModel usuario;
	
	
	
	/********************/
	
	//Constructor vacío
	
	public ProductosModel() { //Constructor vacío
	}

	//Constructor sobrecargado
	public ProductosModel(Long id, String nombre) {
		this.id = id;
		this.nombreProducto = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombreProducto;
	}

	public void setNombre(String nombre) {
		this.nombreProducto = nombre;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
	

	
	
	
	
}
