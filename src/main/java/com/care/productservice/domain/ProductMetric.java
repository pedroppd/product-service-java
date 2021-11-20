package com.care.productservice.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity(name = "ProductIndicator")
public class ProductMetric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "product_uuid")
    private Product product;

    @Column()
    private String metric;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "user_uuid")
    private User user;

    @Column()
    private Double totalMetric;

    @Column()
    private LocalDateTime dt_creation;

    @Column()
    private LocalDateTime dt_update;

    public ProductMetric(){

    }

    public ProductMetric(Product product, String metric, User user, Double totalMetric) {
        this.product = product;
        this.metric = metric;
        this.user = user;
        this.totalMetric = totalMetric;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getTotalMetric() {
        return totalMetric;
    }

    public void setTotalMetric(Double totalMetric) {
        this.totalMetric = totalMetric;
    }

    public LocalDateTime getDt_creation() {
        return dt_creation;
    }

    public void setDt_creation(LocalDateTime dt_creation) {
        this.dt_creation = dt_creation;
    }

    public LocalDateTime getDt_update() {
        return dt_update;
    }

    public void setDt_update(LocalDateTime dt_update) {
        this.dt_update = dt_update;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductMetric that = (ProductMetric) o;
        return uuid.equals(that.uuid) && product.equals(that.product) && metric.equals(that.metric) && user.equals(that.user) && totalMetric.equals(that.totalMetric) && dt_creation.equals(that.dt_creation) && dt_update.equals(that.dt_update);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, product, metric, user, totalMetric, dt_creation, dt_update);
    }

    @Override
    public String toString() {
        return "ProductMetric{" +
                "uuid=" + uuid +
                ", product=" + product +
                ", metric='" + metric + '\'' +
                ", user=" + user +
                ", totalMetric=" + totalMetric +
                ", dt_creation=" + dt_creation +
                ", dt_update=" + dt_update +
                '}';
    }
}
