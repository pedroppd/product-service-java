package com.care.productservice.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity()
public class Company implements Serializable {

    public Company(){

    }

    public Company(String name, String extra) {
        this.name = name;
        this.extra = extra;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @Column()
    private String name;

    @Column()
    private String extra;

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
        Company company = (Company) o;
        return uuid.equals(company.uuid) && name.equals(company.name) && extra.equals(company.extra) && dt_created.equals(company.dt_created) && dt_updated.equals(company.dt_updated) && dt_deleted.equals(company.dt_deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, extra, dt_created, dt_updated, dt_deleted);
    }

    @Override
    public String toString() {
        return "Company{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", extra='" + extra + '\'' +
                ", dt_created=" + dt_created +
                ", dt_updated=" + dt_updated +
                ", dt_deleted=" + dt_deleted +
                '}';
    }
}
