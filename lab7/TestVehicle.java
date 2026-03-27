class Vehicle {
    String brand;
    int wheels;
    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
    }
}
class Car extends Vehicle {
    int maxSpeed;

    Car(String brand, int wheels, int maxSpeed) {
        super(brand, wheels); // calling parent constructor
        this.maxSpeed = maxSpeed;
    }

    void maxSpeed() {
        System.out.println("Car Max Speed: " + maxSpeed + " km/h");
    }
}
class Bicycle extends Vehicle {
    int maxSpeed;

    Bicycle(String brand, int wheels, int maxSpeed) {
        super(brand, wheels);
        this.maxSpeed = maxSpeed;
    }

    void maxSpeed() {
        System.out.println("Bicycle Max Speed: " + maxSpeed + " km/h");
    }
}
class Scooter extends Vehicle {
    int maxSpeed;

    Scooter(String brand, int wheels, int maxSpeed) {
        super(brand, wheels);
        this.maxSpeed = maxSpeed;
    }

    void maxSpeed() {
        System.out.println("Scooter Max Speed: " + maxSpeed + " km/h");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4, 180);
        Bicycle bicycle = new Bicycle("Hero", 2, 25);
        Scooter scooter = new Scooter("Honda", 2, 90);

        System.out.println("Car Details:");
        car.display();
        car.maxSpeed();

        System.out.println("\nBicycle Details:");
        bicycle.display();
        bicycle.maxSpeed();

        System.out.println("\nScooter Details:");
        scooter.display();
        scooter.maxSpeed();
    }
}
