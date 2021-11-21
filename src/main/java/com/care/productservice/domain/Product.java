package com.care.productservice.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(columnDefinition = "binary(36)")
    private UUID uuid;

    @Column(name = "name")
    private String name;

    @Column(name = "extra")
    private String extra;

    @ManyToOne()
    @JoinColumn()
    private Contract contract;

    @Column()
    private LocalDateTime dt_created;

    @Column()
    private LocalDateTime dt_updated;
}
