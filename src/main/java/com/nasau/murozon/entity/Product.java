package com.nasau.murozon.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRODUCT")
@Data // generates getters and setters
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRC_ID", nullable = false)
    private ProductCategory category;

    @Column(name = "PRO_SKU")
    private String sku;

    @Column(name = "PRO_NAME")
    private String name;

    @Column(name = "PRO_DESCRIPTION")
    private String description;

    @Column(name = "PRO_UNIT_PRICE")
    private BigDecimal unitPrice;

    @Column(name = "PRO_IMAGE_URL")
    private String imageUrl;

    @Column(name = "PRO_ACTIVE")
    private boolean avtive;

    @Column(name = "PRO_UNITS_IN_STOCK")
    private int unitsInStock;

    @Column(name = "PRO_DATE_CREATED")
    @CreationTimestamp // Hibernate will automatically manage the timestamps
    private Date dateCreated;

    @Column(name = "PRO_LAST_UPDATED")
    @UpdateTimestamp
    private Date lastUpdated;

}
