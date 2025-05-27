package com.inventorymanagementsystem.dto;


import com.inventorymanagementsystem.entity.Role;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInfoDTO {
    private long id;
    private String userName;
    private String password;
    private String email;
    private Role role;
    private LocalDateTime createdAt;





}
