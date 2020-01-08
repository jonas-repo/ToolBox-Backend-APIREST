package com.toolbox.springboot.backend.apirest.ivancontrollers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toolbox.springboot.backend.apirest.ivanmodels.entity.Productos;
import com.toolbox.springboot.backend.apirest.ivanmodels.entity.RespuestaProductos;
import com.toolbox.springboot.backend.apirest.ivanmodels.services.IProductoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController //se le indica que va a ser un controlador rest
@RequestMapping("/api") //se crea el endpoint para poder consumir los servicios
public class ProductoRestController {
	
	//se instancia la interfaz
	@Autowired
	private IProductoService productoService;
	private String respuesta;
	
	
	//Implementacion del metodo para leer todo
	@GetMapping("/productos")
	public ResponseEntity<?> index(){
		
		List<Productos> productos = productoService.findAll();
		Map<Object,Object> response = new HashMap<>();
		
		for(Productos product:productos)
		{
			RespuestaProductos respuestaProductos= new RespuestaProductos();
			respuestaProductos.setCalificacionesProducto(product.getCalificacionProduct());
			respuestaProductos.setComentariosProducto(product.getComentariosProducto());
			respuestaProductos.setImagenesProducto(product.getImagenesProducto());
			respuestaProductos.setProductos(product);
			
			
			//Object[] obj = {product,product.getCalificacionProduct(),product.getComentariosProducto(),product.getImagenesProducto()};
			
			
		}
		response.put(respuesta, respuestaProductos);
		return new ResponseEntity<Map<Object,Object>>(response,HttpStatus.OK);
	}
	/*
	public List<Productos> index(){
		
		return productoService.findAll();
		
	}
	*/

}
