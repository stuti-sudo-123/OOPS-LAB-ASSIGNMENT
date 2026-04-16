class FibonacciThread extends Thread {
    private volatile boolean pause = false;

    public void setPause(boolean value) {
        pause = value;
    }

    public void run() {
        try {
            long f1 = 1, f2 = 1;
            System.out.println("Fibonacci Series:");

            // First 50 Fibonacci numbers
            System.out.print(f1 + " " + f2 + " ");
            for (int i = 3; i <= 50; i++) {
                long fn = f1 + f2;
                System.out.print(fn + " ");
                f1 = f2;
                f2 = fn;
            }

            // Sleep after 50 numbers
            System.out.println("\nFibonacci thread sleeping...");
            sleep(3000);

            // Continue after prime computation
            while (pause) {
                Thread.yield(); // wait until resumed
            }

            System.out.println("\nResuming Fibonacci computation...");
            for (int i = 51; i <= 60; i++) { // continue more
                long fn = f1 + f2;
                System.out.print(fn + " ");
                f1 = f2;
                f2 = fn;
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class PrimeThread extends Thread {
    public void run() {
        int count = 0, num = 2;

        System.out.println("\nPrime Numbers:");
        while (count < 25) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

public class FibonacciPrime{
    public static void main(String[] args) {
        FibonacciThread fib = new FibonacciThread();
        PrimeThread prime = new PrimeThread();

        // Set priorities
        fib.setPriority(8);
        prime.setPriority(5);

        // Start Fibonacci first
        fib.start();

        try {
            // Wait until Fibonacci finishes first 50 numbers
            Thread.sleep(1000);

            // Pause Fibonacci
            fib.setPause(true);

            // Start Prime computation
            prime.start();

            // Wait for prime to finish
            prime.join();

            // Resume Fibonacci
            fib.setPause(false);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
