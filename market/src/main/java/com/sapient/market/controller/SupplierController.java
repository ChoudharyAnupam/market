package com.sapient.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapient.market.pojo.Product;
import com.sapient.market.service.ProductService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getProduct")
	public String getData() throws JsonProcessingException {
		List<Product> productList = new ArrayList<Product>();
		productList = productService.getProductList();
		return new ObjectMapper().writeValueAsString(productList);
	}
	
	
}
