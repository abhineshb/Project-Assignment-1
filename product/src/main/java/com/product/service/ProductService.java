package com.product.service;

import java.util.List;
import java.util.Map;

import com.product.model.Product;


public interface ProductService {

	public List<Product> addAllProduct(List<Product> list);
	public List<Product> addProduct(Product p);
	
	public List<Product> getAllProduct();
	public Product getProduct(long id);
	
	public List<Product> removeAllProduct();
	public void removeProduct(long id);
	
	public List<Product> updateAllProduct(List<Product> list);
	public List<Product> updateProduct(long id);

}
