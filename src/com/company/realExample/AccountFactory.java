package com.company.realExample;

public interface AccountFactory {
    public abstract BankAccount getBankAccount(int id, double balance, String accountName);
}
