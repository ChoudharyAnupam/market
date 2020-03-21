package com.sapient.market.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue
	private Integer itemId;
	private String itemType;
	private String brand;
	private Float price;
	private String color;
	private Integer size;
	private Integer supId;
	
	
}
