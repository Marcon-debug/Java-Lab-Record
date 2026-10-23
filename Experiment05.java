class Payment {
    // Compile-time polymorphism: Method Overloading
    public void makePayment(double amount) {
        System.out.println("Processing generic cash payment of ₹" + amount);
    }

    public void makePayment(String cardNumber, double amount) {
        System.out.println("Processing Credit/Debit Card payment using card " + cardNumber + " for amount ₹" + amount);
    }
}

class UPIPayment extends Payment {
    // Runtime polymorphism: Method Overriding
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing Instant UPI payment of ₹" + amount + " via secure gateway.");
    }
}

public class Ex05_OnlinePayment {
    public static void main(String[] args) {
        Payment p = new Payment();
        System.out.println("--- Compile-time Polymorphism (Overloading) ---");
        p.makePayment(1500.0);
        p.makePayment("4111-XXXX-XXXX-1234", 4500.0);

        System.out.println("\n--- Runtime Polymorphism (Overriding & Dynamic Dispatch) ---");
        Payment upiObj = new UPIPayment(); // Upcasting
        upiObj.makePayment(2500.0);
    }
}