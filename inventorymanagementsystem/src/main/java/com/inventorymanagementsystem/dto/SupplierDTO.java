package com.inventorymanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SupplierDTO {

    private long id;
    private String name;
    private String  contactName;
    private String phoneNo;
    private String email;
    private String address;
    private LocalDateTime createdAt;
}
