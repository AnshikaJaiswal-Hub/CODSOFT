import java.util.Scanner;

class account {
    private double balance;

    public account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance= balance - amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private account a;

    public ATM(account a) {
        this.a = a;
    }

    public void Menu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void atm() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is : Rs. " + a.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : ");
                    double depositAmount = scanner.nextDouble();
                    a.deposit(depositAmount);
                    System.out.println("Deposit successful.\nYour balance: Rs. " + a.getBalance());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (a.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Your balance: Rs. " + a.getBalance());
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}

public class ATM_Interface {
    public static void main(String[] args) {
        account user = new account(1000); // Initial balance
        ATM a= new ATM(user);
        a.atm();
    }
}
