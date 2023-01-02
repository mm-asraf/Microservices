package com.microservices.ProductService.service;

import org.springframework.validation.annotation.Validated;
import com.microservices.ProductService.model.common.ProductRequest;
import com.microservices.ProductService.model.common.ProductResponse;

import javax.validation.Valid;

@Validated
public interface IProductService  {
	 public long addProduct(@Valid ProductRequest product); 
	 public ProductResponse getProductById(long productId);
}
