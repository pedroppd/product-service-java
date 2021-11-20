package com.care.productservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController( value = "/product-indicator")
public class ProductIndicatorController {

    @GetMapping
    public ResponseEntity<String> getProductIndicators(){
        return ResponseEntity.ok().body("Hello World !!");
    }
}
