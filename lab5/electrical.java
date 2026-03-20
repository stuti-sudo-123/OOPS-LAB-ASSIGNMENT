
class Product{
    int id;
    String name;
    int categoryID;
    double unitprice;
    Product(int id,String name, int categoryID, double unitPrice){
        this.id=id;
        this.name=name;
        this.categoryID=categoryID;
        this.unitprice=unitPrice;
    }
}
class ElectricalProduct extends Product {
    int voltagerange;
    int wattage;
    ElectricalProduct(int id, String name, int categoryID, double unitPrice,int VoltageRange,int Wattage){
        super(id, name, categoryID, unitPrice);
        this.voltagerange=VoltageRange;
        this.wattage=Wattage;
    }
    void updateWattage(int newWattage){
        this.wattage=newWattage;
    }
    void updatePrice(double price){
        this.unitprice=price;
    }
       void display() {
        System.out.println("ID           : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Category ID  : " + categoryID);
        System.out.println("Unit Price   : " + unitprice);
        System.out.println("Voltage Range: " + voltagerange);
        System.out.println("Wattage      : " + wattage);
    }
}
public class electrical{
    public static void main(String[] args) {
        ElectricalProduct e= new ElectricalProduct(111,"TV",1111,50000,2,56); 
        System.out.println("Before update ");
        e.display();
        e.updateWattage(100);
        e.updatePrice(45000.0);
        System.out.println("\nAfter update: ");
        e.display();
    }
}
