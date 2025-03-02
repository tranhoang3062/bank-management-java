package com.bankmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bank_account_number;

    private String bank_account_name;

    private String phone_number;

    private String email;

    private Double balance;

//    @ManyToOne
//    @JoinColumn(name = "bank_id")
//    private Bank bank;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    @PrePersist
    protected void onCreate() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_at = LocalDateTime.now();
    }
}
