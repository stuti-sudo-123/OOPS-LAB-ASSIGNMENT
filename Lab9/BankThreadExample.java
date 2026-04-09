import java.util.Random;

class BankAccount {
    private int balance = 600;
    private Random rand = new Random();

    public synchronized void deposit() {
        try {
            while (balance > 2000) {
                wait(); // wait if balance already high
            }

            int amount = rand.nextInt(200) + 1;
            balance += amount;

            System.out.println("Father deposited: " + amount + 
                               " | Balance: " + balance);

            notify(); // notify son

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void withdraw() {
        try {
            while (balance < 2000) {
                wait(); // wait until enough balance
            }

            int amount = rand.nextInt(150) + 1;
            balance -= amount;

            System.out.println("Son withdrew: " + amount + 
                               " | Balance: " + balance);

            if (balance < 500) {
                notify(); // notify father to deposit again
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Father extends Thread {
    BankAccount acc;

    Father(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        while (true) {
            acc.deposit();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

class Son extends Thread {
    BankAccount acc;

    Son(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        while (true) {
            acc.withdraw();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

public class BankThreadExample {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        Father father = new Father(acc);
        Son son = new Son(acc);

        father.start();
        son.start();
    }
}