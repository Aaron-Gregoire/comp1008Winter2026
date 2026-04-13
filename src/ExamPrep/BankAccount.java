package ExamPrep;

public abstract class BankAccount implements Transactable {

    private String owner;
    private String accountNumber;
    private double balance;

    public BankAccount(String owner, String accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Concrete — shared by all accounts
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " | Balance: $" + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountSummary() {
        return getClass().getSimpleName() + " [" + accountNumber + "] Owner: " + owner;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract — each account type has its own withdrawal rules
    @Override
    public abstract void withdraw(double amount);
}
