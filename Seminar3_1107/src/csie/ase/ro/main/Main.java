package csie.ase.ro.main;

import csie.ase.ro.enums.AccountType;
import csie.ase.ro.models.Bank;
import csie.ase.ro.models.BankAccount;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("SOLID_BANK");

        // --- Open/Closed: new account type, no existing class modified ---
        BankAccount savings = bank.openAccount(AccountType.SAVINGS, 500);
        BankAccount investment = bank.openAccount(AccountType.INVESTMENT, 10000);

        System.out.println(savings);
        System.out.println(investment);
    }
    }

