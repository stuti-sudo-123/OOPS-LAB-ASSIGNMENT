class Invoice{
    String partNumber;
    String description;
    int quantity;
    double price;
    Invoice(String partNumber, String description, int quantity, double price ){
            this.partNumber=partNumber;
            this.description=description;
            setQuantity(quantity);
            setPrice(price);
    }
    //getters and setters
    void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }
    String getPartNumber(){
        return partNumber;
    }
     void setDescription(String description){
        this.description=description;
    }
    String getDescription(){
        return description;
    }
     void setQuantity(int quantity){
        if(quantity>0)
        this.quantity=quantity;
        else
        this.quantity=0;
    }
    int getQuantity(){
        return quantity;
    }
     void setPrice(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
    //invoice amount
    double getInvoiceAmount(){
        return quantity*price;
    }
}
public class Lab2q2 {
    public static void main(String[] args) {
        Invoice inv=new Invoice("111","pen",2 , 100);
        System.out.println(" Part Number "+ inv.getPartNumber());
        System.out.println("Description: " + inv.getDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per item: " + inv.getPrice());
        System.out.println("Invoice Amount: " + inv.getInvoiceAmount());
    }
}
