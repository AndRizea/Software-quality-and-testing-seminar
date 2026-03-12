package csie.ase.ro.models;

import csie.ase.ro.exceptions.IllegalTransferException;
import csie.ase.ro.exceptions.InsufficientFundsException;

public abstract class Account {
    public abstract double getBalance();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount)
            throws InsufficientFundsException;
    public abstract void transfer(Account destination, double amount)
            throws IllegalTransferException, InsufficientFundsException;
}
