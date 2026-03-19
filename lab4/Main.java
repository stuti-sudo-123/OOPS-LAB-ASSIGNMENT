import java.util.Scanner;
interface Function {
    int evaluate(int x);
}
class Half implements Function {
    public int evaluate(int x) {
        return x / 2;
    }
}
public class Main {
    public static int[] processArray(int[] arr) {

        Half f = new Half();   

        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            result[i] = f.evaluate(arr[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }

        int[] output = processArray(input);

        System.out.println("Output array:");

        for(int val : output)
            System.out.print(val + " ");
        sc.close();
    }
}

