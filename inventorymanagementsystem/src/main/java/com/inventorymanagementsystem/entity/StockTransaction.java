package com.inventorymanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StockTransaction {

    @Id
    private long id;
    @ManyToOne
    private Product product;
    @Enumerated(EnumType.STRING)
    private Type type;
    private int quantity;
    private LocalDateTime transactionDate;
    @ManyToOne
    private UserInfo performedBy;
    private String remarks;
}
