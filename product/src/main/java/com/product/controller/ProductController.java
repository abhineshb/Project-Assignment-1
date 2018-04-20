package com.product.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.product.model.Product;
import com.product.model.UserDetail;
import com.product.service.ProductService;

@Controller
@Scope("session")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	List<Product> prodList;

	@RequestMapping(value = "/", method = RequestMethod.GET )
	public String loginPage(Model model) {
		System.out.println("login here ");
		return "login";
	}
	

	@RequestMapping(value = "/homePage", method = RequestMethod.POST)
	public String UserValidate(@Validated UserDetail user, Model model) {
		System.out.println(user.getUserId() + "===" + user.getPassword());
		if (user.getUserId().equals("user") && user.getPassword().equals("password")) {
			System.out.println("indside");
			return "ProductHome";
		} else {
			System.out.println("else");
			return "loginFail";
		}
	}

	/*@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public String getAllproduct(@RequestParam String param) {
		System.out.println(param);
		Gson g = new Gson();

		return g.toJson(new ArrayList<Product>(productService.getAllProduct().values()));
	}*/

	//private Map<Long, Product> employeeMap = new HashMap<>();

	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public String getAllproductItem(Model model) {
        System.out.println("Listing Items");
		//prodList = productService.getAllProduct();
		model.addAttribute("prodList", prodList);
		return "Item";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(Model model, @RequestBody Product product)
	{
		System.out.println("adding products:"+product.getId()+product.getName());
		prodList = (List<Product>) productService.addProduct(product);
		model.addAttribute("prodList", prodList);
		return "Item";
	}
	
	
	@RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.DELETE)
	public String deleteproductItem(@PathVariable long  id,Model model) {
        System.out.println("Listing Items" + id);
		 productService.removeProduct(id);
		// prodList =productService.getAllProduct();
		 
		model.addAttribute("prodList", prodList);
		return "Item";
	}
	
	@RequestMapping(value = "/openEditWindow/{prodId}", method = RequestMethod.GET)
	public String openEditWindow(Model model, @PathVariable(value = "prodId") long prodId)
	{
		System.out.println("Edit function:"+prodId);
		 System.out.println("Listing Items" + prodId);
			Product p =new Product();
		//	 prodList =productService.getAllProduct();
			 for(Product pp : prodList)
			 {
				 if(pp.getId()==prodId)
				 {
					 p.setName(pp.getName());
					 p.setDescription(pp.getDescription());
					 p.setPrice(pp.getPrice());
					 p.setQuantity(pp.getQuantity());
				 }
			 }
		model.addAttribute("prodDetails", p);
		return "EditProduct";
	}
	
	
	@RequestMapping(value = "/getUpdatePage/{id}", method = RequestMethod.GET)
	public String updateproductItem(@PathVariable long  id,Model model) {
        System.out.println("Listing Items" + id);
		Product p =new Product();
		// prodList =productService.getAllProduct();
		 for(Product pp : prodList)
		 {
			 if(pp.getId()==id)
			 {
				 p.setName(pp.getName());
				 p.setDescription(pp.getDescription());
				 p.setPrice(pp.getPrice());
				 p.setQuantity(pp.getQuantity());
			 }
		 }
		 
		model.addAttribute("prodList", p);
		return "UpdateItem";
	}

}
