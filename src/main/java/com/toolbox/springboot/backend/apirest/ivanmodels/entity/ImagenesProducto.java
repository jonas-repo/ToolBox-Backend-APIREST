package com.toolbox.springboot.backend.apirest.ivanmodels.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productimages")
public class ImagenesProducto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idImages;
	
	private String imageRoute;
	private int productID;
	
	
	
	public int getIdImages() {
		return idImages;
	}

	public void setIdImages(int idImages) {
		this.idImages = idImages;
	}

	public String getImageRoute() {
		return imageRoute;
	}

	public void setImageRoute(String imageRoute) {
		this.imageRoute = imageRoute;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}



	private static final long serialVersionUID = 1L;
}
