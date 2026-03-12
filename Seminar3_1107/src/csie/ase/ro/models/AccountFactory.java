package csie.ase.ro.models;

import csie.ase.ro.enums.AccountType;

public class AccountFactory {

    public static BankAccount createAccount(AccountType type, double initialBalance, String iban) {
        switch (type) {
            case CREDIT:
                return new CurrentAccount(iban);
            case SAVINGS:
                return new SavingsAccount(
                        Math.max(initialBalance, SavingsAccount.MIN_BALANCE), iban);
            case INVESTMENT:
                return new InvestmentAccount(initialBalance, iban,
                        java.time.Year.now().getValue() + 3);
            default:
                throw new UnsupportedOperationException(
                        "Unknown account type: " + type);
        }
    }
}