package com.microservices.ProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.ProductService.model.common.ProductRequest;
import com.microservices.ProductService.model.common.ProductResponse;
import com.microservices.ProductService.service.IProductService;

@RestController
@RequestMapping("api/v0/product")
public class ProductController {
	@Autowired
	IProductService iProductService;
	
	@PostMapping
	public ResponseEntity<Long> addProduct(@RequestBody ProductRequest product) {
		long productId = iProductService.addProduct(product);
		return new ResponseEntity<>(productId,HttpStatus.CREATED);		
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<ProductResponse> getProductById(@PathVariable("productId") long productId){
		ProductResponse response = iProductService.getProductById(productId);
		return new ResponseEntity<ProductResponse>(response,HttpStatus.OK);
	}

}
