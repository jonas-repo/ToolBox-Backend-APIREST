package com.toolbox.springboot.backend.apirest.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="product")
public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long productid;
	
	@NotEmpty
	@Size(max = 50)
	private String productdescription;
	
	@Size(max = 50)
	@Column(nullable = true)
	private String productbrand;
	
	@Column(precision = 2)
	private double productprice;
	
	@Size(max = 50)
	@Column(nullable = true)
	private String productmodel;
	
	@NotEmpty
	@Size(max = 50)
	private String productname;
	
	@Column(nullable = true)
	private int productquantity;
	
	@Temporal(TemporalType.DATE)
	private Date productdate;
	
	@PrePersist
	public void prePersist() {
		this.productdate = new Date();
	}
	
	public long getProductId() {
		return this.productid;
	}
	
	public void setProductDescription(String productDescription) {
		this.productdescription = productDescription;
	}
	public String getProductDescription() {
		return this.productdescription;
	}
	
	public void setProductBrand(String productBrand) {
		this.productbrand = productBrand;
	}
	public String getProductBrand() {
		return this.productbrand;
	}
	
	public void setProductPrice(double productPrice) {
		this.productprice = productPrice;
	}
	public double getProductPrice() {
		return this.productprice;
	}
	
	public void setProductModel(String productModel) {
		this.productmodel = productModel;
	}
	public String getProductModel() {
		return this.productmodel;
	}
	
	public void setProductName(String productName) {
		this.productname = productName;
	}
	public String getProductName() {
		return this.productname;
	}
	
	public void setProductQuantity(int productQuantity) {
		this.productquantity = productQuantity;
	}
	public int getProductQuantity() {
		return this.productquantity;
	}
	
	public void setProductDate(Date date) {
		this.productdate = date;
	}
	public Date getProductDate() {
		return this.productdate;
	}
}
