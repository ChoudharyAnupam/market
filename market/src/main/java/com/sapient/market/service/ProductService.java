package com.sapient.market.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.market.dao.ProductDAO;
import com.sapient.market.pojo.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDaoImpl;

	public List<Product> getProductList() {

		List<Product> productList = new ArrayList<Product>();
		productList = productDaoImpl.findAll();

		return productList;
	}

	public List<Product> getProductByBrand(String brandName) {

		List<Product> productList = new ArrayList<Product>();
		productList = productDaoImpl.findByBrand(brandName);
		return productList;
	}

	public List<Product> getProductByColor(String color) {

		List<Product> productList = new ArrayList<Product>();
		productList = productDaoImpl.findByColor(color);
		return productList;
	}

	public List<Product> getProductBySize(Integer size) {

		List<Product> productList = new ArrayList<Product>();
		productList = productDaoImpl.findBySize(size);
		return productList;
	}

}
