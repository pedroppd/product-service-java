package com.care.productservice.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity()
public class User implements Serializable {

    public User(){

    }

    public User(String name, List<String> roles, String password) {
        this.name = name;
        this.roles = roles;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @Column(nullable = false, length = 50)
    private String name;

    @ElementCollection
    @Column()
    private List<String> roles = new ArrayList<>();

    @Column()
    private String password;

    @ManyToOne()
    @JoinColumn(name = "contract_uuid")
    private Contract contract;

    @Column()
    private LocalDateTime dt_created;

    @Column()
    private LocalDateTime dt_updated;

    @Column()
    private LocalDateTime dt_deleted;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public LocalDateTime getDt_created() {
        return dt_created;
    }

    public void setDt_created(LocalDateTime dt_created) {
        this.dt_created = dt_created;
    }

    public LocalDateTime getDt_updated() {
        return dt_updated;
    }

    public void setDt_updated(LocalDateTime dt_updated) {
        this.dt_updated = dt_updated;
    }

    public LocalDateTime getDt_deleted() {
        return dt_deleted;
    }

    public void setDt_deleted(LocalDateTime dt_deleted) {
        this.dt_deleted = dt_deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uuid.equals(user.uuid) && name.equals(user.name) && roles.equals(user.roles) && password.equals(user.password) && dt_created.equals(user.dt_created) && dt_updated.equals(user.dt_updated) && dt_deleted.equals(user.dt_deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, roles, password, dt_created, dt_updated, dt_deleted);
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", roles=" + roles +
                ", password='" + password + '\'' +
                ", dt_created=" + dt_created +
                ", dt_updated=" + dt_updated +
                ", dt_deleted=" + dt_deleted +
                '}';
    }
}
