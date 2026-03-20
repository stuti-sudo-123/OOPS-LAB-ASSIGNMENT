class Bank {
    double deposit(double amount, double balance) {
        return balance + amount;
    }
    double withdraw(double amount, double balance) {
        if (balance >= amount) {
            return balance - amount;
        } else {
            System.out.println("Insufficient Balance!");
            return 0;
        }
    }
}

public class Balance {
    public static void main(String[] args) {

        Bank b = new Bank();

        double balance = 1000;
        balance = b.deposit(500, balance);
        System.out.println("After Deposit: " + balance);
        balance = b.withdraw(300, balance);
        System.out.println("After Withdrawal: " + balance);
        balance = b.withdraw(1500, balance);
        System.out.println("After Withdrawal Attempt: " + balance);
    }
}