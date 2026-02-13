import java.util.*;

public class PerfectStringCheck {

    public static boolean isPerfect(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c))
                return false;
            set.add(c);
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        if(isPerfect(s))
            System.out.println("Perfect String");
        else
            System.out.println("Not Perfect String");

        sc.close();
    }
}
