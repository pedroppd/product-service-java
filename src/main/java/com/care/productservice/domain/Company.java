package com.care.productservice.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "company")
public class Company implements Serializable {

    public Company(String name, String extra) {
        this.name = name;
        this.extra = extra;
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
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
