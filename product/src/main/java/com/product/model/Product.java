package com.product.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {

	private long id;
	private String name;
	private String description;
	private String price;
	private int quantity;
	// private String relatedProduct;
	//private String image;
	
	public Product()
	{
		
	}

	public Product(long id, String name, String description, String price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		// this.relatedProduct = relatedProduct;
		//this.image = image;

	}

	//Map<String, Product> productMap = new HashMap<String, Product>() 
	public static List<Product> prodList = new ArrayList<Product>();
	

	
	/**
	 * @return the productMap
	 */
	/*public static Map<String, Product> getProductMap() {
		return productMap;
	}

	*//**
	 * @param productMap
	 *            the productMap to set
	 *//*
	public static void setProductMap(Map<String, Product> productMap) {
		Product.productMap = productMap;
	}*/

	public static List<Product> getProdList() {
		return prodList;
	}

	public static void setProdList(List<Product> prodList) {
		Product.prodList = prodList;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the relatedProduct
	 */
	/*
	 * public String getRelatedProduct() { return relatedProduct; }
	 *//**
		 * @param relatedProduct
		 *            the relatedProduct to set
		 *//*
		 * public void setRelatedProduct(String relatedProduct) {
		 * this.relatedProduct = relatedProduct; }
		 */

	/**
	 * @return the image
	 */
	/*public String getImage() {
		return image;
	}

	*//**
	 * @param image
	 *            the image to set
	 *//*
	public void setImage(String image) {
		this.image = image;
	}*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Product other = (Product) obj;
		if (id == other.id)
			return true;
		return false;
	}

	
}
