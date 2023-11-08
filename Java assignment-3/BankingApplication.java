/*Write a program in Java to develop Banking Application in which user deposits the amount
Rs 2000.00 and then start withdrawing of Rs 1400.00, Rs 300.00 and it throws exception
“Not Sufficient Fund” when user withdraws Rs. 500 thereafter. Before withdrawing an
amount ask for pin number, if the pin number is not valid throw the “InvalidPinNumber”
Exception.*/
import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidPinNumberException extends Exception {
    public InvalidPinNumberException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    private int pin;

    public BankAccount(double initialBalance, int pin) {
        balance = initialBalance;
        this.pin = pin;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount);
    }

    public void withdraw(double amount, int enteredPin) throws InsufficientFundsException, InvalidPinNumberException {
        if (enteredPin != pin) {
            throw new InvalidPinNumberException("Invalid Pin Number");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Funds");
        }

        balance -= amount;
        System.out.println("Withdrawn: Rs " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(2000.0, 1234); // Initial balance of Rs 2000.00 and PIN 1234

        System.out.println("Welcome to the Banking Application");

        while (true) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            try {
                account.withdraw(1400.0, enteredPin);
                account.withdraw(300.0, enteredPin);
                account.withdraw(500.0, enteredPin); // This will throw an InsufficientFundsException
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
                break; // Exit the loop if there are insufficient funds
            } catch (InvalidPinNumberException e) {
                System.out.println(e.getMessage());
                break; // Exit the loop if the PIN is invalid
            }
        }

        System.out.println("Current Balance: Rs " + account.getBalance());
        scanner.close();
    }
}
