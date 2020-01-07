package com.toolbox.springboot.backend.apirest.ivanmodels.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productrate")
public class CalificacionProducto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productRateId;
	
	private int productRate;
	private int userId;
	private int productID;
	
	
	
	
	public int getProductRateId() {
		return productRateId;
	}


	public void setProductRateId(int productRateId) {
		this.productRateId = productRateId;
	}


	public int getProductRate() {
		return productRate;
	}


	public void setProductRate(int productRate) {
		this.productRate = productRate;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}

	private static final long serialVersionUID = 1L;
}
