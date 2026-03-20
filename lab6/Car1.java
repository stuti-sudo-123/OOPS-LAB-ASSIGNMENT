abstract class Car {
    String brand; 


    Car(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }

    abstract void avg();    
    abstract void model();   
}
class Maruti extends Car {

    Maruti() {
        super("Maruti");
    }

    void avg() {
        System.out.println("Average: 20 km/l");
    }

    void model() {
        System.out.println("Model: Swift");
    }
}
class Santro extends Car {

    Santro() {
        super("Santro");
    }

    void avg() {
        System.out.println("Average: 18 km/l");
    }

    void model() {
        System.out.println("Model: Hyundai Santro");
    }
}
public class Car1 {
    public static void main(String[] args) {

        Car c;
        c = new Maruti();
        c.displayBrand();
        c.avg();
        c.model();

        System.out.println();
        c = new Santro();
        c.displayBrand();
        c.avg();
        c.model();
    }
}
