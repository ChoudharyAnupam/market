package com.sapient.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapient.market.pojo.Product;
import com.sapient.market.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getProduct")
	public String getData() throws JsonProcessingException {
		List<Product> productList = new ArrayList<Product>();
		productList = productService.getProductList();
		return new ObjectMapper().writeValueAsString(productList);
	}

	@GetMapping("/getByBrand")
	public String getProudctByBrand(@RequestParam String brandName) throws JsonProcessingException {
		List<Product> productList = new ArrayList<Product>();
		
		System.out.println("Brand Name " + brandName);
		
		productList = productService.getProductByBrand(brandName);

		return new ObjectMapper().writeValueAsString(productList);
	}
	
	@GetMapping("/getByColor")
	public String getProudctByColor(@RequestParam String color) throws JsonProcessingException {
		List<Product> productList = new ArrayList<Product>();
		
		System.out.println("Brand Name " + color);
		
		productList = productService.getProductByColor(color);

		return new ObjectMapper().writeValueAsString(productList);
	}
	

	@GetMapping("/getBySize")
	public String getProudctBysize(@RequestParam String size) throws JsonProcessingException {
		List<Product> productList = new ArrayList<Product>();
		
		System.out.println("Brand Name " + size);
		
		productList = productService.getProductBySize(Integer.parseInt(size));

		return new ObjectMapper().writeValueAsString(productList);
	}

}
