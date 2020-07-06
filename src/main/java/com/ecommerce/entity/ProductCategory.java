package com.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="PRDCT_CTGR")
public class ProductCategory {
	@Id
	private Integer id;
	private String name;
	
	@JsonIgnoreProperties("productCategory")
	@OneToMany(mappedBy = "productCategory", fetch = FetchType.LAZY)
	private Set<Product> products;
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}