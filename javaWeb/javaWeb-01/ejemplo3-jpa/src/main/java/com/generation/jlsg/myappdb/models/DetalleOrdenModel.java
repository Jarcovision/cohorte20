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
@Table(name = "detalleOrden")

public class DetalleOrdenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreDetalleOrden;

	/**********relaciones**********/
	
	@OneToOne //(mappedBy = "orden") 
	private OrdenesModel orden;
	//private String nombreOrden;
	/********************/
	
	//Constructor vacío
	public DetalleOrdenModel() {
	}
	
	//Constructor sobrecargado
	public DetalleOrdenModel(Long id, String nombreDetalleOrden, OrdenesModel orden) {
		this.id = id;
		this.nombreDetalleOrden = nombreDetalleOrden;
        this.orden = orden;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreDetalleOrden() {
		return nombreDetalleOrden;
	}

	public void setNombreDetalleOrden(String nombreDetalleOrden) {
		this.nombreDetalleOrden = nombreDetalleOrden;
	}

	public OrdenesModel getOrden() {
		return orden;
	}

	public void setOrden(OrdenesModel orden) {
		this.orden = orden;
	}
	
	
	

}
