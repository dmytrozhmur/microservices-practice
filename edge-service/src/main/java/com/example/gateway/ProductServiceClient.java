package com.example.gateway;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "product-service", url = "http://localhost:8080/")
public interface ProductServiceClient {

    @GetMapping("/products")
    List<Products> getProducts();

}