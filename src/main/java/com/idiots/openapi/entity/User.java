package com.idiots.openapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "user")
public class User {
    @Id
    private Long accountId;
    private String email;
    private String name;
    private String password;
    private String phoneNumber;
    private String status;
    private String role;
    private String createdAt;
    private String updatedAt;
    private String lastLogin;
}
