package com.microservices.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservices.ProductService.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {

}
