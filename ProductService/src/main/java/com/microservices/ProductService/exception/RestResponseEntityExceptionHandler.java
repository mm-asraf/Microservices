package com.microservices.ProductService.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.microservices.ProductService.model.common.ErrorResponse;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductServiceExceptionHandler.class)
    public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceExceptionHandler exception) {
           ErrorResponse response = ErrorResponse.builder()
        		   .errorMessage(exception.getMessage())
        		   .errorCode(exception.getErrorCode())
        		   .build();
           return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
    }
}

