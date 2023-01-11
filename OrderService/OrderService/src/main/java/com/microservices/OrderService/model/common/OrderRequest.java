package com.microservices.OrderService.model.common;


public class OrderRequest {
	private long productId;
	private long totalAmount;
	private long quantity;
	private PaymentMode paymentMode;
}
