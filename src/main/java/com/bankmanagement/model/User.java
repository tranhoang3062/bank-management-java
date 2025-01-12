package com.bankmanagement.model;

//import jakarta.persistence.*;
import lombok.Data;

@Data
//@Entity
public class User {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bank_account_number;

    private String bank_account_name;

    private String phone_number;

    private String email;
}
