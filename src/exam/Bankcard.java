package exam;
import java.util.Scanner;

public class Bankcard {


    private String cardNum;
    private String holderFirstName;
    private String holerLastName;
    private int[] transactionYears;

    public void BankCard() {
        static void debitCard () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter card number");
            String cardNum = scanner.nextLine();

            String regex = "\\d{16}";

            if (cardNum.matches(regex)) {
                System.out.println("Valid Card number");
            } else {
                System.out.println("invalid number");
            }

            System.out.println("enter cardholder first name");
        }
    }
}


    /*BankCard

Description
Create a class BankCard representing a payment card.

It must have:
long cardNumber (exactly 16 digits)
String holderName (validate with regex: ^[A-Za-z ]+$)
int[] transactionYears

Requirements:

Constructors (at least 2)
Static factories (debitCard(), creditCard())
Validation with exceptions
toString() that constructs a string using the StringBuilder
Unit tests: 1 regular test, 1 parameterized test for cardNumber and holderName, totaling 4 tests */
}
