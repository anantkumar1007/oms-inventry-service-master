package com.ecommerce.service;

import com.ecommerce.entity.Brand;
import com.ecommerce.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
    BrandRepository brandRepository;

	@Override
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}

}
