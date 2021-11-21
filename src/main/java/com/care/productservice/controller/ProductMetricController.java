package com.care.productservice.controller;

import com.care.productservice.domain.ProductMetric;
import com.care.productservice.repository.ProductMetricRepository;
import com.care.productservice.service.ProductMetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product-metric")
public class ProductMetricController {

    @Autowired
    private ProductMetricRepository productMetricRepository;

    @GetMapping
    public ResponseEntity<List<ProductMetric>> getProductMetric(){
        return ResponseEntity.ok().body(this.productMetricRepository.findAll());
    }
}
