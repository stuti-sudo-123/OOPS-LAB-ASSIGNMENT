import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Months: ");
        int months = sc.nextInt();
        double r = rate / 100;
        double time = months / 12.0;
        double interest = principal * r * time;
        double balance = principal + interest;
        System.out.println("Interest = " + interest);
        System.out.println("Final Balance = " + balance);

        sc.close();
    }
}