package csie.ase.ro.main;

import csie.ase.ro.enums.AccountType;
import csie.ase.ro.models.Bank;
import csie.ase.ro.models.BankAccount;

public class Main {
    public static void main(String[] args){
        Bank randomBank = new Bank("BANK1");
        BankAccount account = randomBank.openAccount(AccountType.CREDIT);
        account = randomBank.openAccount(AccountType.SAVINGS);
    }
}
