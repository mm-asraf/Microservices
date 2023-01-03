package com.microservices.OrderService.model;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "PRODUCT_ID")
	private long productId;

	@Column(name = "QUANTITY")
	private long quantity;

	@Column(name="ORDER_DATE")
	private Instant orderDate;

	@Column(name="STATUS")
	private String orderStatus;

	@Column(name="TOTAL_AMOUNT")
	private long amount;
}
