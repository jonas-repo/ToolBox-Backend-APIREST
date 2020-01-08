package com.toolbox.springboot.backend.apirest.ivanmodels.entity;

import java.io.Serializable;
import java.util.List;

public class RespuestaProductos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Productos productos;
	private List<CalificacionProducto> CalificacionesProducto;
	private List<ComentariosProducto> ComentariosProducto;
	private List<ImagenesProducto> ImagenesProducto;
	
	public Productos getProductos() {
		return productos;
	}
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	public List<CalificacionProducto> getCalificacionesProducto() {
		return CalificacionesProducto;
	}
	public void setCalificacionesProducto(List<CalificacionProducto> calificacionesProducto) {
		CalificacionesProducto = calificacionesProducto;
	}
	public List<ComentariosProducto> getComentariosProducto() {
		return ComentariosProducto;
	}
	public void setComentariosProducto(List<ComentariosProducto> comentariosProducto) {
		ComentariosProducto = comentariosProducto;
	}
	public List<ImagenesProducto> getImagenesProducto() {
		return ImagenesProducto;
	}
	public void setImagenesProducto(List<ImagenesProducto> imagenesProducto) {
		ImagenesProducto = imagenesProducto;
	}
	
	
	

}
