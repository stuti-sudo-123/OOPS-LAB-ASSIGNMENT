class Fruit{
    String name;
    String singleORbunch;
    double price;
    Fruit(String name, String singleORbunch, double price ){
        this.name=name;
        this.singleORbunch=singleORbunch;
        this.price=price;
    }
    void disply(){
        System.out.println("NAME:  "+ name);
        System.out.println("TYPE:  "+ singleORbunch);
        System.out.println("PRICE: "+ price);
    }
}
public class Fruitobject {
    public static void main(String[] args) {
        Fruit apple= new Fruit("Apple", "Single", 25);
        System.out.println("\nFRUIT 1 : ");
        apple.disply();
        Fruit banana= new Fruit("Banana", "Pair", 5);
        System.out.println("\nFRUIT 2 : ");
        banana.disply();
    }
}
