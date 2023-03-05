package com.managmentsystem.fullstackapi.controller;

import com.managmentsystem.fullstackapi.exeption.ProductNotFoundException;
import com.managmentsystem.fullstackapi.model.Product;
import com.managmentsystem.fullstackapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/api/postProduct")
    Product newPorduct(@RequestBody Product newProduct){
        return productRepository.save(newProduct);
    }

    @GetMapping("/api/getProducts")
    List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/api/product/{id}")
    Product getProductById(@PathVariable Long id){
        return productRepository.findById(id)
                .orElseThrow(()->new ProductNotFoundException(id));
    }
}
