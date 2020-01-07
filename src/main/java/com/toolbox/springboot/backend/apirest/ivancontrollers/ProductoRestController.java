package com.toolbox.springboot.backend.apirest.ivancontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toolbox.springboot.backend.apirest.ivanmodels.entity.Productos;
import com.toolbox.springboot.backend.apirest.ivanmodels.services.IProductoService;

//@CrossOrigin(origins= {"http://localhost:4200"})
@RestController //se le indica que va a ser un controlador rest
@RequestMapping("/api") //se crea el endpoint para poder consumir los servicios
public class ProductoRestController {
	
	//se instancia la interfaz
	@Autowired
	private IProductoService productoService;
	
	
	//Implementacion del metodo para leer todo
	@GetMapping("/productos")
	public List<Productos> index(){
		
		return productoService.findAll();
		
	}

}
