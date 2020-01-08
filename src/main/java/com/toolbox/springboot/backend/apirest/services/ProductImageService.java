package com.toolbox.springboot.backend.apirest.services;

import java.util.List;

import com.toolbox.springboot.backend.apirest.model.entity.Product;
import com.toolbox.springboot.backend.apirest.model.entity.ProductImage;

public interface ProductImageService {
	
	public List<ProductImage> findAllProductImages(Long id);
	
	public ProductImage save(ProductImage productImage);
	
	public void delete(Long id);
	
	public void deleteAllById(Product product);
}
