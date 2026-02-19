import java.util.Scanner;
public class PatternCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        int count = 0;

        for(int i = a; i <= b; i++) {

            String num = String.valueOf(i);
            if(num.contains(pattern)){
                count++;
            }
        }
        System.out.println("Pattern occurs " + count + " times");
        sc.close();
    }
}

