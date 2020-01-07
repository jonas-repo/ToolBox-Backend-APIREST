package com.toolbox.springboot.backend.apirest.ivanmodels.services;

import java.util.List;

import com.toolbox.springboot.backend.apirest.ivanmodels.entity.Productos;

//Interfaz que crea los métodos para depues ser implementados en una clase "implement"
//Estos metodos son los del CRUD
public interface IProductoService {
	
	//Método equivalente al READ ALL
	public List<Productos> findAll();
	
}
