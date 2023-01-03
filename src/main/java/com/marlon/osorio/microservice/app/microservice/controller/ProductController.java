package com.marlon.osorio.microservice.app.microservice.controller;

import com.marlon.osorio.microservice.app.microservice.models.entity.Product;
import com.marlon.osorio.microservice.app.microservice.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public List<Product> getAll() {
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.findById(id);
    }
}
