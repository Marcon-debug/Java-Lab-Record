import java.util.InputMismatchException;
import java.util.Scanner;

// User-defined Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Withdrawal amount exceeds available balance of ₹" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
    }
}

public class Ex08_ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(10000.0);

        try {
            System.out.print("Current Account Balance: ₹10000.0\nEnter amount to withdraw: ₹");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InputMismatchException e) {
            System.out.println("Exception Caught: Please enter valid numeric input.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction completion process finished. Closing scanner.");
            scanner.close();
        }
    }
}