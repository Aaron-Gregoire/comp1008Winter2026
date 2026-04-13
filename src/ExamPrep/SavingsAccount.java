package ExamPrep;

public class SavingsAccount extends BankAccount {

    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(String owner, String accountNumber, double balance) {
        super(owner, accountNumber, balance);
    }

    // Overrides withdraw — enforces minimum balance rule
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Savings: cannot go below $" + MIN_BALANCE);
            return;
        }
        setBalance(getBalance() - amount);
        System.out.println("Savings withdrew $" + amount + " | Balance: $" + getBalance());
    }
}