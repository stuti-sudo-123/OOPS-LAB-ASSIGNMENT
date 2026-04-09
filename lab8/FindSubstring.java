import java.util.Scanner;
public class FindSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        String s1= s.toLowerCase();
        int firstPos= s1.indexOf("the");
        int lastPos= s1.lastIndexOf("the");
        if(firstPos!=-1&& lastPos!=-1 && firstPos!=lastPos){
            String result= s1.substring(firstPos+3,lastPos);
            System.out.println("First occurrence at index: " + firstPos);
            System.out.println("Last occurrence at index: " + lastPos);
            System.out.println("Extracted string: " + result);
        }
        else{
            System.out.println("'the' does not occur at least twice in the text.");
        }
        sc.close();
    }
}
