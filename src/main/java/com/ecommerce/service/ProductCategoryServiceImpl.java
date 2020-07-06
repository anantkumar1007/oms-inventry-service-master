package com.ecommerce.service;

import com.ecommerce.entity.ProductCategory;
import com.ecommerce.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
    ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategory> findAll() {
		return productCategoryRepository.findAll();
	}

}
