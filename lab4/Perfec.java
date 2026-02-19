
import java.util.Scanner;
public class Perfec{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int count=0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println("It is not a perfect string");
                break;
            }
            count++;
        }
        if(count==s.length()){
            System.out.println("perfect string");
        }
        sc.close();
    }
}
