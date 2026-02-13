import java.util.Scanner;

public class CharFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        System.out.println("Characters with frequency > " + n + " :");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > n) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
        sc.close();
    }
}
