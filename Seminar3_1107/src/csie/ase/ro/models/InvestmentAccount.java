package csie.ase.ro.models;

import csie.ase.ro.exceptions.InsufficientFundsException;
import csie.ase.ro.interfaces.Profitable;
import csie.ase.ro.interfaces.Taxable;

public class InvestmentAccount extends BankAccount implements Profitable, Taxable {

    private int lockedUntilYear;

    public InvestmentAccount(double balance, String iban, int lockedUntilYear) {
        super(balance, iban);
        this.lockedUntilYear = lockedUntilYear;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        int currentYear = java.time.Year.now().getValue();
        if (currentYear < lockedUntilYear) {
            throw new InsufficientFundsException(
                    "Account is locked until " + lockedUntilYear + ". Cannot withdraw.");
        }
        if (amount > this.balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        this.balance -= amount;
    }

    @Override
    public void addInterest(double percentValue) {
        this.balance += this.balance * percentValue / 100;
    }

    @Override
    public void applyTax(double taxRate) {
        double tax = this.balance * taxRate / 100;
        this.balance -= tax;
        System.out.println("Tax applied: " + tax + ". New balance: " + this.balance);
    }

    @Override
    public String toString() {
        return "InvestmentAccount [balance=" + balance + ", iban=" + iban
                + ", lockedUntil=" + lockedUntilYear + "]";
    }
}
