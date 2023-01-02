package com.microservices.ProductService.service.Impl;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.ProductService.exception.ProductServiceExceptionHandler;
import com.microservices.ProductService.model.Product;
import com.microservices.ProductService.model.common.ProductRequest;
import com.microservices.ProductService.model.common.ProductResponse;
import com.microservices.ProductService.repository.IProductRepository;
import com.microservices.ProductService.service.IProductService;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductServiceImpl implements IProductService {
	@Autowired
	private IProductRepository iProductRepo;
	
	@Override
	public long addProduct(@Valid ProductRequest productRequest) {
		log.info("product added...");
		Product product = Product.builder()
				.productName(productRequest.getProductName()) 
				.productPrice(productRequest.getProductPrice())
				.productQuantity(productRequest.getProductQuantity())
				.build();
		iProductRepo.save(product);
		log.info("product created");
		return product.getProductId();
	}

	@Override
	public ProductResponse getProductById(long productId) {
		log.info("get product by id",productId);
		Product product = iProductRepo.findById(productId).orElseThrow(()->{throw new ProductServiceExceptionHandler("product with this id is not present","PRODUCT_NOT_FOUND");});
		ProductResponse productResponse = new ProductResponse();
		BeanUtils.copyProperties(product, productResponse);
		return productResponse;
	}

}
