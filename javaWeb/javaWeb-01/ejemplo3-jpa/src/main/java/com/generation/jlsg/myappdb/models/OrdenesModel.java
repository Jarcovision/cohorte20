package com.generation.jlsg.myappdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordenes")

public class OrdenesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreOrden;
	
	/**********relaciones**********/
	@ManyToOne  //Muchos productos con un usuario
	private UsuarioModel usuario;

	@OneToOne(mappedBy = "ordenes")
	private DetalleOrdenModel detalleOrden;
	/********************/
	
	//Constructor vacío
	public OrdenesModel() {
	}

	//Constructor sobrecargado
	public OrdenesModel(Long id, String nombreOrden, UsuarioModel usuario) {
		this.id = id;
		this.nombreOrden = nombreOrden;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreOrden() {
		return nombreOrden;
	}

	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public DetalleOrdenModel getDetalleOrden() {
		return detalleOrden;
	}

	public void setDetalleOrden(DetalleOrdenModel detalleOrden) {
		this.detalleOrden = detalleOrden;
	}

	
	
	
}
