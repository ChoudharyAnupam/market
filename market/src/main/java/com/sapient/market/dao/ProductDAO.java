package com.sapient.market.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.market.pojo.Product;

@Repository
@Transactional
public interface ProductDAO extends JpaRepository<Product, Long>{

	
	List<Product> findByBrand(String brand);
	List<Product> findByColor(String color);
	List<Product> findBySize(Integer size);
	
}
