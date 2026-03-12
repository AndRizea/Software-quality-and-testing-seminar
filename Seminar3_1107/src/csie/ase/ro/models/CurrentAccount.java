package csie.ase.ro.models;

import csie.ase.ro.exceptions.IllegalTransferException;
import csie.ase.ro.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

    public static final double MAX_CREDIT = 5000;

    public CurrentAccount(String iban){
        super(CurrentAccount.MAX_CREDIT, iban);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount > this.balance){
            throw new InsufficientFundsException("Insufficient money!");
        }
        this.balance -= amount;
    }
}