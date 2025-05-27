package com.inventorymanagementsystem.dto;

import com.inventorymanagementsystem.entity.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StockTransactionDTO {
    private long id;
    private ProductDTO product;
    private Type type;
    private int quantity;
    private LocalDateTime transactionDate;
    private UserInfoDTO performedBy;
    private String remarks;
}
