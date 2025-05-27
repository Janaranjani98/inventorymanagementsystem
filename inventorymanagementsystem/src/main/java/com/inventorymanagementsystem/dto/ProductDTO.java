package com.inventorymanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.StringReader;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductDTO {

    private long id;
    private String name;
    private String sku;
    private String description;
    private int quantity;
    private BigDecimal  price;
    private CategoryDTO category;
    private LocalDateTime createdAt;
}
