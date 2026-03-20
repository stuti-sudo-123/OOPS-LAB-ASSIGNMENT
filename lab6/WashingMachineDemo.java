class WashingMachine {
    boolean isPoweredOn;
    int     noOfClothes;
    String  detergent;
    String  brand;
    WashingMachine(String brand) {
        this.brand       = brand;
        this.isPoweredOn = false;
        this.noOfClothes = 0;
        this.detergent   = "None";
    }
    void switchOn() {
        if (isPoweredOn) {
            System.out.println("Machine is already ON.");
        } else {
            isPoweredOn = true;
            System.out.println("------------------------------");
            System.out.println(brand + " Washing Machine is ON.");
            System.out.println("------------------------------");
        }
    }
    int acceptClothes(int noOfClothes) {
        if (!isPoweredOn) {
            System.out.println("Please switch ON the machine first!");
            return 0;
        }
        this.noOfClothes = noOfClothes;
        System.out.println("Clothes accepted  : " + noOfClothes + " items");
        return this.noOfClothes;
    }
    void acceptDetergent(String detergent) {
        if (!isPoweredOn) {
            System.out.println("Please switch ON the machine first!");
            return;
        }
        this.detergent = detergent;
        System.out.println("Detergent added   : " + detergent);
    }
    void startWash() {
        if (!isPoweredOn) {
            System.out.println("Please switch ON the machine first!");
            return;
        }
        if (noOfClothes == 0) {
            System.out.println("No clothes loaded! Please add clothes.");
            return;
        }
        if (detergent.equals("None")) {
            System.out.println("No detergent added! Please add detergent.");
            return;
        }
        System.out.println("------------------------------");
        System.out.println("Washing " + noOfClothes + " clothes");
        System.out.println("Using detergent   : " + detergent);
        System.out.println("Status            : Washing...");
        System.out.println("Status            : Rinsing...");
        System.out.println("Status            : Spinning...");
        System.out.println("Wash cycle complete!");
        System.out.println("------------------------------");
    }
    void switchOff() {
        if (!isPoweredOn) {
            System.out.println("Machine is already OFF.");
        } else {
            isPoweredOn  = false;
            noOfClothes  = 0;
            detergent    = "None";
            System.out.println("------------------------------");
            System.out.println(brand + " Washing Machine is OFF.");
            System.out.println("------------------------------");
        }
    }
}

public class WashingMachineDemo {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine("Samsung");

        System.out.println("====== Washing Machine Demo ======\n");
        System.out.println("--- Normal Wash Cycle ---");
        wm.switchOn();
        int clothes = wm.acceptClothes(10);
        System.out.println("Returned count    : " + clothes + " items");
        wm.acceptDetergent("Ariel");
        wm.startWash();
        wm.switchOff(); 
    }
}
