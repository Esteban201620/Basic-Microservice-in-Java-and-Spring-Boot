package com.marlon.osorio.microservice.app.microservice.models.service;

import com.marlon.osorio.microservice.app.microservice.models.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
}
