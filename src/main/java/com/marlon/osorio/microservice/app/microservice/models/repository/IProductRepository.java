package com.marlon.osorio.microservice.app.microservice.models.repository;

import com.marlon.osorio.microservice.app.microservice.models.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
