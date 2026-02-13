
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

        Function f = new Half();   

        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            result[i] = f.evaluate(arr[i]);
        }

        return result;
    }
    public static void main(String[] args) {

        int[] input = {10, 20, 30, 40, 50};

        int[] output = processArray(input);

        System.out.println("Output array:");

        for(int val : output)
            System.out.print(val + " ");
    }
}

