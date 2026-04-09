class SinThread extends Thread {
    double x;

    SinThread(double x) {
        this.x = x;
    }

    public void run() {
        double result = Math.sin(x);
        System.out.println("sin(" + x + ") = " + result);
    }
}

class CosThread extends Thread {
    double x;

    CosThread(double x) {
        this.x = x;
    }

    public void run() {
        double result = Math.cos(x);
        System.out.println("cos(" + x + ") = " + result);
    }
}

public class TrigThreadExample {
    public static void main(String[] args) {

        double x = Math.PI / 4; 

        SinThread t1 = new SinThread(x);
        CosThread t2 = new CosThread(x);
        t1.start();
        t2.start();

        System.out.println("Main thread executed...");
    }
}
