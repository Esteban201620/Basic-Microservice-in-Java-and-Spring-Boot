package com.marlon.osorio.microservice.app.microservice.models.service;

import com.marlon.osorio.microservice.app.microservice.models.entity.Product;
import com.marlon.osorio.microservice.app.microservice.models.repository.IProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    @Transactional/*(readOnly = true)*/
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
