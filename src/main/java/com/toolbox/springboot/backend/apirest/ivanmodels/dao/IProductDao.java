package com.toolbox.springboot.backend.apirest.ivanmodels.dao;

import org.springframework.data.repository.CrudRepository;

import com.toolbox.springboot.backend.apirest.ivanmodels.entity.Productos;

public interface IProductDao extends CrudRepository<Productos,Long> {

}
