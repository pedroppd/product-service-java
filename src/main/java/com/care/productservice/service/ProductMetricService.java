package com.care.productservice.service;

import com.care.productservice.domain.ProductMetric;
import com.care.productservice.repository.ProductMetricRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductMetricService {

    @Autowired
    private ProductMetricRepository productMetricRepository;

    public List<ProductMetric> findAll(){
        return this.productMetricRepository.findAll();
    }
}
