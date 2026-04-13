package ExamPrep;

public class ChequingAccount extends BankAccount {

    private static final double OVERDRAFT_LIMIT = 500.0;
    private static final double OVERDRAFT_FEE   = 5.0;

    public ChequingAccount(String owner, String accountNumber, double balance) {
        super(owner, accountNumber, balance);
    }

    // Overrides withdraw — allows overdraft, charges fee
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < -OVERDRAFT_LIMIT) {
            System.out.println("Chequing: overdraft limit of $" + OVERDRAFT_LIMIT + " reached");
            return;
        }
        double fee = getBalance() - amount < 0 ? OVERDRAFT_FEE : 0;
        setBalance(getBalance() - amount - fee);
        System.out.println("Chequing withdrew $" + amount +
                (fee > 0 ? " + $" + fee + " overdraft fee" : "") +
                " | Balance: $" + getBalance());
    }
}
