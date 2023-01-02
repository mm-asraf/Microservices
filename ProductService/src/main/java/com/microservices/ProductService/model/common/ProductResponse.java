package com.microservices.ProductService.model.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
	private long productId;
	private String productName;
	private String productPrice;
	private String productQuantity;
}
