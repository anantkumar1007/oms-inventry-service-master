package com.ecommerce.controller;

import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = productService.findAll();
        return new ResponseEntity<List<Product>>(products, new HttpHeaders(),
                HttpStatus.OK);

    }

    @GetMapping("/filter/{filter}/{value}")
    public ResponseEntity<List<Product>> getProducts(@PathVariable String filter,
                                                     @PathVariable String value) {
        List<Product> products = productService.getProducts(filter, value);
/*
        if(products==null || products.isEmpty())
            throw new B2CException("Product not found!");
*/

        return new ResponseEntity<List<Product>>(products,
                new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product products  = productService.createProduct(product);
         return  new ResponseEntity<Product>(products, new HttpHeaders(), HttpStatus.CREATED);
    }
}