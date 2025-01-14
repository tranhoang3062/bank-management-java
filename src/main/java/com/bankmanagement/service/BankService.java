package com.bankmanagement.service;

import com.bankmanagement.model.Bank;

import java.util.List;
import java.util.Optional;

public interface BankService {
    List<Bank> getAllBanks();
    Bank getBankById(Long id);
    Bank createBank(Bank bank);
    Optional<Bank> updateBank(Long id, Bank updatedBank);
    void deleteBank(Long id);
}