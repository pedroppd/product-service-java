package com.care.productservice.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity()
public class Contract {

    public Contract(){

    }

    public Contract(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @Column()
    private String name;

    @ManyToOne()
    @JoinColumn(name = "company_uuid")
    private Company company;

    @Column()
    private LocalDateTime dt_created;

    @Column()
    private LocalDateTime dt_updated;

    @Column()
    private LocalDateTime dt_deleted;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return uuid.equals(contract.uuid) && name.equals(contract.name) && dt_created.equals(contract.dt_created) && dt_updated.equals(contract.dt_updated) && dt_deleted.equals(contract.dt_deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, dt_created, dt_updated, dt_deleted);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", dt_created=" + dt_created +
                ", dt_updated=" + dt_updated +
                ", dt_deleted=" + dt_deleted +
                '}';
    }
}

