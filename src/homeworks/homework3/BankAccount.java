package homeworks.homework3;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(double amount, BankAccount targetAccount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Некорректная сумма перевода");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }

        balance -= amount;
        targetAccount.deposit(amount);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
