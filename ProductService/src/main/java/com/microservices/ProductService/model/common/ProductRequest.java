package com.microservices.ProductService.model.common;

import lombok.Data;

@Data
public class ProductRequest {
	private String productName;
	private String productPrice;
	private String productQuantity;
}
