package com.ecommerce.service;

import com.ecommerce.entity.Color;
import com.ecommerce.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
	
	@Autowired
    ColorRepository colorRepository;

	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}
	
}
