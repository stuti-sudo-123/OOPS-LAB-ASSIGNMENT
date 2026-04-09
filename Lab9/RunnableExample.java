// Step 1: Implement Runnable interface
class MyRunnable implements Runnable {

    Thread t;
    MyRunnable() {
        t = new Thread(this);
        t.start();
    }
    public void run() {
        System.out.println("Thread is running using Runnable...");
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();

        System.out.println("Main method is running...");
    }
}