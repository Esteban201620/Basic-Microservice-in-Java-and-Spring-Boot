package com.marlon.osorio.microservice.app.microservice.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
    @Getter
    @Setter
    @Table(name = "product")
    public class Product implements Serializable {
        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
        private Long id;
        private String name;
        private Double cost;
        @Column(name = "created_at")
        @Temporal(TemporalType.DATE)
        private Date createdAt;
    }
