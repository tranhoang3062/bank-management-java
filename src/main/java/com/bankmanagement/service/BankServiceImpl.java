package com.bankmanagement.service;

import com.bankmanagement.model.Bank;
import com.bankmanagement.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;

    public BankServiceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    @Override
    public Bank getBankById(Long id) {
        return bankRepository.findById(id).orElseThrow(() -> new RuntimeException("Bank not found"));
    }

    @Override
    public Bank createBank(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public Optional<Bank> updateBank(Long id, Bank updatedBank) {
        return bankRepository.findById(id).map(bank -> {
            bank.setBank_name(updatedBank.getBank_name());
            bank.setBank_code(updatedBank.getBank_code());
            bank.setPhone_number(updatedBank.getPhone_number());
            bank.setAddress(updatedBank.getAddress());
            bank.setWebsite_url(updatedBank.getWebsite_url());
            return bankRepository.save(bank);
        });
    }

    @Override
    public void deleteBank(Long id) {
        bankRepository.deleteById(id);
    }
}

