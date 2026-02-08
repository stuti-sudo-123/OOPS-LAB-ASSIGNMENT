import java.util.Scanner;
class CostPerDay{
    double miles;
    double average;
    double tolls;
    double cost;
    double milesPerGallon;
    double calculateTotalCost(){
        return ((miles/milesPerGallon)*cost+average+tolls);
    }
}
public class Lab2q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CostPerDay obj=new CostPerDay();
        System.out.println("Enter total miles travelled in a day: ");
        obj.miles=sc.nextDouble();
        System.out.println("Enter miles travelled per gallon: ");
        obj.milesPerGallon=sc.nextDouble();
        System.out.println("Enter cost per gallon: ");
        obj.cost=sc.nextDouble();
        System.out.println("Enter average fee per day: ");
        obj.average=sc.nextDouble();
        System.out.println("Enter tolls per day: ");
        obj.tolls=sc.nextDouble();
        System.out.println("Total daily cost: "+obj.calculateTotalCost());
        sc.close();
    }
}