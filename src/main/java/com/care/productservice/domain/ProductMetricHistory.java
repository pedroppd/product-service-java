package com.care.productservice.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "product_metric_history")
public class ProductMetricHistory {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;

    @ManyToOne()
    @JoinColumn()
    private Product product;

    @Column()
    private String metric;

    @ManyToOne()
    @JoinColumn()
    private User user;

    @Column()
    private Double totalMetric;

    @Column()
    private LocalDateTime dt_creation;

    @Column()
    private LocalDateTime dt_update;

    @Column()
    private Status status;

    public ProductMetricHistory(Product product, String metric, User user, Double totalMetric) {
        this.product = product;
        this.metric = metric;
        this.user = user;
        this.totalMetric = totalMetric;
    }
}
