package ExamPrep;

public class LoanAccount extends BankAccount {

    private double interestRate;

    public LoanAccount(String owner, String accountNumber,
                       double loanAmount, double interestRate) {
        super(owner, accountNumber, -loanAmount); // negative = money owed
        this.interestRate = interestRate;
    }

    // Overrides withdraw — loan accounts don't allow withdrawals
    @Override
    public void withdraw(double amount) {
        System.out.println("Loan: withdrawals not permitted. Use deposit() to make payments.");
    }

    public double getInterestRate() { return interestRate; }
}