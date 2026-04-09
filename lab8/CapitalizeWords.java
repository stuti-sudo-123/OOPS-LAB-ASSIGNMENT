import java.util.Scanner;
public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a line :");
        String s= sc.nextLine();
        String result="";
        String words[]=s.split(" ");
        for(String w: words){
            if(w.length()>0){
                result+= w.substring(0,1).toUpperCase()+w.substring(1)+" ";
            }
        }
        System.out.println("New string: "+ result.trim());
        sc.close();
    }
}
