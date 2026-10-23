class Account {
    String accountHolderName;
    long accountNumber;

    public Account(String name, long accNo) {
        this.accountHolderName = name;
        this.accountNumber = accNo;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
    }
}

// Single Inheritance
class SavingsAccount extends Account {
    double balance;

    public SavingsAccount(String name, long accNo, double balance) {
        super(name, accNo);
        this.balance = balance;
    }

    public void displaySavingsDetails() {
        displayAccountInfo();
        System.out.println("Account Type   : Savings Account");
        System.out.println("Balance        : ₹" + balance);
        System.out.println("-----------------------------------");
    }
}

// Hierarchical Inheritance: Another child of Account
class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(String name, long accNo, double limit) {
        super(name, accNo);
        this.overdraftLimit = limit;
    }

    public void displayCurrentDetails() {
        displayAccountInfo();
        System.out.println("Account Type   : Current Account");
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
        System.out.println("-----------------------------------");
    }
}

// Multilevel Inheritance: PremiumSavingsAccount extends SavingsAccount
class PremiumSavingsAccount extends SavingsAccount {
    double cashbackRate;

    public PremiumSavingsAccount(String name, long accNo, double balance, double cashbackRate) {
        super(name, accNo, balance);
        this.cashbackRate = cashbackRate;
    }

    public void displayPremiumDetails() {
        displayAccountInfo();
        System.out.println("Account Type   : Premium Savings Account");
        System.out.println("Balance        : ₹" + balance);
        System.out.println("Cashback Rate  : " + cashbackRate + "%");
        System.out.println("-----------------------------------");
    }
}

public class Ex04_BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Tafadzwa", 100123456L, 25000.0);
        CurrentAccount ca = new CurrentAccount("KPR Industries", 100987654L, 50000.0);
        PremiumSavingsAccount psa = new PremiumSavingsAccount("Makoni", 100555444L, 150000.0, 2.5);

        sa.displaySavingsDetails();
        ca.displayCurrentDetails();
        psa.displayPremiumDetails();
    }
}