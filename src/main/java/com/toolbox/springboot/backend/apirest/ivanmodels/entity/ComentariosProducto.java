package com.toolbox.springboot.backend.apirest.ivanmodels.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="productcomments")
public class ComentariosProducto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productCommentoID;
	
	private String productComment;
	private int productID;
	private int userId;
	
	@Temporal(TemporalType.DATE)
	private Date productCommentDate;
	
	
	
	public int getProductCommentoID() {
		return productCommentoID;
	}



	public void setProductCommentoID(int productCommentoID) {
		this.productCommentoID = productCommentoID;
	}



	public String getProductComment() {
		return productComment;
	}



	public void setProductComment(String productComment) {
		this.productComment = productComment;
	}



	public int getProductID() {
		return productID;
	}



	public void setProductID(int productID) {
		this.productID = productID;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public Date getProductCommentDate() {
		return productCommentDate;
	}



	public void setProductCommentDate(Date productCommentDate) {
		this.productCommentDate = productCommentDate;
	}



	private static final long serialVersionUID = 1L;

}
