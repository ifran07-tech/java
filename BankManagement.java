import java.util.Scanner;

class BankAccount {
    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public void createAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 5; // 5%

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: " + interest);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount();

        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double bal = sc.nextDouble();

        acc.createAccount(accNo, name, bal);

        int choice;
        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Display  4.Interest  5.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    acc.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    acc.withdraw(sc.nextDouble());
                    break;

                case 3:
                    acc.display();
                    break;

                case 4:
                    acc.calculateInterest();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}