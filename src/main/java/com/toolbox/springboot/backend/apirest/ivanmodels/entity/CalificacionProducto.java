package com.toolbox.springboot.backend.apirest.ivanmodels.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="productrate")
public class CalificacionProducto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productrateid;
	
	private int productrate;

	@ManyToOne(fetch =FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="productid")
	private Productos productos;

	public int getProductrateid() {
		return productrateid;
	}

	public void setProductrateid(int productrateid) {
		this.productrateid = productrateid;
	}

	public int getProductrate() {
		return productrate;
	}

	public void setProductrate(int productrate) {
		this.productrate = productrate;
	}
	
	
	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}


	private static final long serialVersionUID = 1L;
}
