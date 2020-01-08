package com.toolbox.springboot.backend.apirest.ivanmodels.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="productcomments")
public class ComentariosProducto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productcommentid;
	
	private String productcomment;
	
	@Temporal(TemporalType.DATE)
	private Date productcommentdate;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="productid")
	private Productos productos;
	

	
	public int getProductcommentid() {
		return productcommentid;
	}

	public void setProductcommentid(int productcommentid) {
		this.productcommentid = productcommentid;
	}

	public String getProductcomment() {
		return productcomment;
	}

	public void setProductcomment(String productcomment) {
		this.productcomment = productcomment;
	}

	public Date getProductcommentdate() {
		return productcommentdate;
	}

	public void setProductcommentdate(Date productcommentdate) {
		this.productcommentdate = productcommentdate;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	private static final long serialVersionUID = 1L;

}
