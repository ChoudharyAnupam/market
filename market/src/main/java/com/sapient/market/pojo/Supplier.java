package com.sapient.market.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Supplier {

	@Id
	@GeneratedValue
	private Integer id;
	private String sup_name;
	private String address;
	
}
