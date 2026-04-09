import java.util.Scanner;
public class VowelOccur {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a string");
    String s= sc.nextLine();
    String s1= s.toLowerCase();
    System.out.println("Vowels and their positions:");
    for(int i=0; i<s1.length();i++){
        char ch=s1.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel: " + ch + " at position: " + i);
            }
    }
    sc.close();
}
}
