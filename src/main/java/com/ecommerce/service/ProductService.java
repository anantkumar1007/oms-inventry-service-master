package com.ecommerce.service;

import com.ecommerce.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
	List<Product> findAll();
	Optional<Product> findById(Integer id);
	List<Product> getProducts(String groupbyvalue, String actualvalue);
	Product createProduct(Product product);
}
