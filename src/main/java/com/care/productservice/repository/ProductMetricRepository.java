package com.care.productservice.repository;

import com.care.productservice.domain.ProductMetric;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductMetricRepository extends JpaRepository<ProductMetric, UUID> {

}