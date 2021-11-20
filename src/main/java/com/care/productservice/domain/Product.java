package com.care.productservice.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity()
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @Column()
    private String name;

    @Column()
    private String extra;

    @ManyToOne()
    @JoinColumn(name = "contract_uuid")
    private Contract contract;

    @Column()
    private LocalDateTime dt_created;

    @Column()
    private LocalDateTime dt_updated;

    @Column()
    private LocalDateTime dt_deleted;

    public Product(){

    }

    public Product(String name, String extra) {
        this.name = name;
        this.extra = extra;
    }

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

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
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

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
