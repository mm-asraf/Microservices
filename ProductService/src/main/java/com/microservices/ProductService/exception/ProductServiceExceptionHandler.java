package com.microservices.ProductService.exception;

import lombok.Data;

@Data
public class ProductServiceExceptionHandler extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String errorCode;
	public ProductServiceExceptionHandler(String message,String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
}
