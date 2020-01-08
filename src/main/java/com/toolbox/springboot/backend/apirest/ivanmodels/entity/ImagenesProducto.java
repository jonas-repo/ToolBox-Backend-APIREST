package com.toolbox.springboot.backend.apirest.ivanmodels.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="productimages")
public class ImagenesProducto implements Serializable {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idimages;
	
	private String imageroute;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="productid")
	private Productos productos;

	
	public int getIdimages() {
		return idimages;
	}



	public void setIdimages(int idimages) {
		this.idimages = idimages;
	}



	public String getImageroute() {
		return imageroute;
	}



	public void setImageroute(String imageroute) {
		this.imageroute = imageroute;
	}



	public Productos getProductos() {
		return productos;
	}



	public void setProductos(Productos productos) {
		this.productos = productos;
	}



	private static final long serialVersionUID = 1L;
}
