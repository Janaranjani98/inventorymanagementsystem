package com.inventorymanagementsystem.entity;

import com.inventorymanagementsystem.dto.CategoryDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    private long id;
    private String name;
    @Column(unique = true)
    private String sku;
    private String description;
    private int quantity;
    private BigDecimal price;
    @ManyToOne
    private Category category;
    private LocalDateTime createdAt;
}
