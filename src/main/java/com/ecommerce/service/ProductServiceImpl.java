package com.ecommerce.service;

import com.ecommerce.enuum.GroupBy;
import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProducts(String groupByValue, String actualValue) {

        GroupBy groupBy = GroupBy.valueOf(groupByValue.toUpperCase());
        switch (groupBy) {
            case BRAND:
                return productRepository.findByBrandId(Integer.valueOf(actualValue));
            case COLOR:
                return productRepository.findByColorId(Integer.valueOf(actualValue));
            case SIZE:
                return productRepository.findBySize(actualValue);
            default:
                return null;
        }
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }
}
