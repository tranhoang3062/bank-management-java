package com.bankmanagement.model;

//import jakarta.persistence.*;
import lombok.Data;

@Data
//@Entity
public class Bank {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bank_name;

    private String bank_code;

    private String address;

    private String phone_number;

    private String website_url;
}
