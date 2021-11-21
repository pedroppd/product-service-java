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
@Table(name = "contract")
public class Contract {

    public Contract(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(columnDefinition = "binary(36)")
    private UUID uuid;

    @Column()
    private String name;

    @ManyToOne()
    @JoinColumn()
    private Company company;

    @Column()
    private LocalDateTime dt_created;

    @Column()
    private LocalDateTime dt_updated;

    @Column()
    private LocalDateTime dt_deleted;
}

