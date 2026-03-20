class Employee {
    String name;
    int hoursWorked;
    double hourlyRate = 12.0;   
    double taxRate    = 0.15;   

    Employee(String name, int hoursWorked) {
        this.name         = name;
        this.hoursWorked  = hoursWorked;
    }
    double calculateGrossPay() {
        return hoursWorked * hourlyRate;
    }
    double calculateTax() {
        return calculateGrossPay() * taxRate;
    }
    double calculateNetPay() {
        return calculateGrossPay() - calculateTax();
    }
    void display() {
        System.out.println("Employee  : " + name);
        System.out.println("Hours     : " + hoursWorked);
        System.out.println("Hourly    : $" + hourlyRate);
        System.out.println("Gross Pay : $" + calculateGrossPay());
        System.out.println("Tax (15%) : $" + calculateTax());
        System.out.println("Net Pay   : $" + calculateNetPay());
    }
}

public class TaxCalculator {
    public static void main(String[] args) {
        Employee e1 = new Employee("Stuti", 12);
        Employee e2 = new Employee("Jas",   13);
        System.out.println("Utopia Tax Calculator\n");
        e1.display();
        System.out.println("\n");
        e2.display();

    }
}