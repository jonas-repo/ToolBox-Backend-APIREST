package com.toolbox.springboot.backend.apirest.ivanmodels.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="product")
public class Productos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;

	private String productdescription;

	private String productbrand;
	
	private Double productprice;

	private String productmodel;

	private String productname;
	
	private int productquantity;
	
	@Temporal(TemporalType.DATE)
	private Date productdate;
	
	@OneToMany(mappedBy="productos")
	@JsonIgnore
	List<CalificacionProducto> calificacionProduct;
	
	@JsonIgnore
	@OneToMany(mappedBy="productos")
	List<ComentariosProducto> comentariosProducto;
	
	@JsonIgnore
	@OneToMany(mappedBy="productos")
	List<ImagenesProducto> imagenesProducto;
	

	public int getProductid() {
		return productid;
	}



	public void setProductid(int productid) {
		this.productid = productid;
	}



	public String getProductdescription() {
		return productdescription;
	}



	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}



	public String getProductbrand() {
		return productbrand;
	}



	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}



	public Double getProductprice() {
		return productprice;
	}



	public void setProductprice(Double productprice) {
		this.productprice = productprice;
	}



	public String getProductmodel() {
		return productmodel;
	}



	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public int getProductquantity() {
		return productquantity;
	}



	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}



	public Date getProductdate() {
		return productdate;
	}



	public void setProductdate(Date productdate) {
		this.productdate = productdate;
	}
	
	
	public List<CalificacionProducto> getCalificacionProduct() {
		return calificacionProduct;
	}

	public void setCalificacionProduct(List<CalificacionProducto> calificacionProduct) {
		this.calificacionProduct = calificacionProduct;
	}

	
	public List<ComentariosProducto> getComentariosProducto() {
		return comentariosProducto;
	}


	public void setComentariosProducto(List<ComentariosProducto> comentariosProducto) {
		this.comentariosProducto = comentariosProducto;
	}
	

	public List<ImagenesProducto> getImagenesProducto() {
		return imagenesProducto;
	}


	public void setImagenesProducto(List<ImagenesProducto> imagenesProducto) {
		this.imagenesProducto = imagenesProducto;
	}






	private static final long serialVersionUID = 1L;

}
