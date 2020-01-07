package com.toolbox.springboot.backend.apirest.ivanmodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toolbox.springboot.backend.apirest.ivanmodels.dao.IProductDao;
import com.toolbox.springboot.backend.apirest.ivanmodels.entity.Productos;

//Clase que implementa la interfaz del Producto con los metodos del CRUD
@Service
public class ProductosServiceImplement implements IProductoService{
	
	
	//Se instancia  la interfaz dao que contiene CrudRepository de Spring en un Objeto
	@Autowired
	private IProductDao productDao;
	
	
	//Metodo implementado de la interfaz IProductoService
	@Override
	@Transactional(readOnly = true) // se le asigna que solo es una consulta y se activa el solo lectura
	public List<Productos> findAll() {
		
		//Se retorna uan lista utilizando el Objeto y su metodo de findAll
		return (List<Productos>) productDao.findAll();
	}

}
