package ExamPrep;

public class BankRunner {

    public static void main(String[] args) {

        // Upcasting — all stored as BankAccount reference
        BankAccount[] accounts = {
                new SavingsAccount("Alice", "SAV-001", 500.0),
                new ChequingAccount("Bob",   "CHQ-002", 200.0),
                new LoanAccount("Carol",    "LON-003", 1000.0, 0.05)
        };

        // Same method call — different behaviour at runtime (polymorphism)
        for (BankAccount acc : accounts) {
            System.out.println("\n" + acc.getAccountSummary());
            acc.deposit(100.0);
            acc.withdraw(50.0);  // polymorphic — each class decides what happens
        }

        // Interface reference — most general
        Transactable t = new SavingsAccount("Dave", "SAV-004", 300.0);
        t.withdraw(250.0);
        System.out.println("Balance: $" + t.getBalance());
    }
}