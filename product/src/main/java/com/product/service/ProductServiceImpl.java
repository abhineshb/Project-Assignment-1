package com.product.service;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//import java.util.Map;

///import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.product.dao.ProductDAO;
import com.product.model.Product;

@Service
public class ProductServiceImpl  implements ProductService{

	/*@Autowired
	private ProductDAO dao;*/

	@Override
	public List<Product> addAllProduct(List<Product> list) {
		return null;	
	}

	@Override
	public List<Product> addProduct(Product p) {
		
		Product prod = new Product(p.getId(),p.getName(),p.getDescription(),p.getPrice(),p.getQuantity());
		Product.prodList.add(prod);
		List<Product> pp = Product.getProdList();
		//Collections.reverse(pp);
		for(Product pr:pp)
	        System.out.println("list:"+pr+" ");
		return pp;
	}

	@Override
	public List<Product> getAllProduct() {
		System.out.println("list Item Impl");
		List<Product> p = Product.getProdList();
		Collections.reverse(p);
		for(Product pr:p)
	        System.out.println("list:"+pr+" ");
		return p;
	}

	@Override
	public Product getProduct(long id) {
		return null;
	}

	@Override
	public List<Product> removeAllProduct() {
		return null;
		
	}

	@Override
	public void removeProduct(long id) {
		Iterator< Product> p =(Iterator<Product>) Product.getProdList().iterator();
		 while(p.hasNext())
		 {
			 Product product =(Product)p.next();
			 if(product.getId()==id)
				 p.remove();
			 
		 }
	}

	@Override
	public List<Product> updateAllProduct(List<Product> list) {
		return null;
	}

	@Override
	public List<Product> updateProduct(long id) {
		return null;
	}
}
