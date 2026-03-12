package csie.ase.ro.models;

import csie.ase.ro.enums.AccountType;

import java.util.HashMap;

public class Bank {
    private String name;
    private int nextIBAN;
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    public Bank(String name) {
        this.name = name;
        this.nextIBAN = 1;
    }

    public BankAccount openAccount(AccountType type, double initialBalance) {
        String nextIbanValue = this.name + (this.nextIBAN++);
        BankAccount newAccount = AccountFactory.createAccount(type, initialBalance, nextIbanValue);
        this.accounts.put(nextIbanValue, newAccount);
        return newAccount;
    }

    public BankAccount getAccount(String iban) {
        return this.accounts.get(iban);
    }
}
