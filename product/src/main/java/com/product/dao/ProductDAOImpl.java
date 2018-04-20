/*package com.product.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
     int id=111;
	@Override
	public void addAllProduct(List<Product> list) {
		
		
	Map<String,Product> m=	Product.getProductList();
	for(Product p :list)
		m.put(""+id,p);
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		Map<String,Product> m=	Product.getProductMap();
		m.put(""+id,p);
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		    return Product.getProductMap();
	}

	@Override
	public List<Product> getProduct(long id) {
		// TODO Auto-generated method stub
		return Product.getProdList().get(id);
	}

	@Override
	public void removeAllProduct() {
		// TODO Auto-generated method stub
		Product.getProductMap().clear();
		
	}

	@Override
	public void removeProduct(long id) {
		// TODO Auto-generated method stub
		Product.getProductMap().remove(id);
		
	}

	@Override
	public void updateAllProduct(List<Product> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(long id) {
		// TODO Auto-generated method stub
		
	}

	
}
*/