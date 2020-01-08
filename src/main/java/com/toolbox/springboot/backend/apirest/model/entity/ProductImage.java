package com.toolbox.springboot.backend.apirest.model.entity;

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
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "productimages")
public class ProductImage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idimages;
	
	@NotEmpty
	private String imageroute;
	
	@ManyToOne
	@JoinColumn(name="productid")
	private Product productId;
	
	public Long getIdImages() {
		return this.idimages;
	}
	
	public void setImageRoute(String imageRoute) {
		this.imageroute = imageRoute;
	}
	public String getImageRoute() {
		return this.imageroute;
	}
	
	public void setProductId(Product product) {
		this.productId = product;
	}
	public Product getProductId() {
		return this.productId;
	}

}
