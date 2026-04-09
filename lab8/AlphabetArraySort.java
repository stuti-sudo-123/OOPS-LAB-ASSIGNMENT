import java.util.Scanner;
import java.util.Arrays;
public class AlphabetArraySort {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String names[]= new String[10];
        String newNames[]= new String[10];
        System.out.println("Enter 10 names");
        for(int i=0;i<10;i++){
            names[i]=sc.nextLine();
        }
        for(int i=0;i<10;i++){
            if(names[i].length()>3){
                newNames[i]=names[i].substring(3);
            }
            else{
                newNames[i]="";
            }
        }
        System.out.println("\n\nModified names :");
        Arrays.sort(newNames);
        for(String s: newNames){
            System.out.println(s);
        }
        sc.close();
     }
}
