
class NotHexadecimal extends Exception{
    NotHexadecimal(String s){
        super(s);
    }
    }

class Hexadecimal{
    static void tester(String s)throws NotHexadecimal{
       if(s.length()==0){
        throw new NotHexadecimal("String cannot be empty");
       }
       else{
        for(int i=0;i<s.length();i++){
            char ch= s.toUpperCase().charAt(i);
            boolean alpha= (ch>='A' && ch<='F');
            boolean num= (ch>='0' && ch<='9');
            if(!alpha&&!num){
               throw new NotHexadecimal(ch+ " is not a hexadecimaL character");
            }
        }
       }
        System.out.println(s +" is a hexadecimal");
      }
    }

public class hexadecimallpl {
   public static void main(String[] args) {
            String[] testCases = {
            "",       
            "a23",     
            "a3#"       
        };

        for (String test : testCases) {
            System.out.println("Testing: \"" + test + "\"");
            try {
                Hexadecimal.tester(test);          
            } catch (NotHexadecimal ex) {
                System.out.println("Exception: " + ex.getMessage());
            } finally {
                System.out.println("Ending the program\n"); 
            }
        }
   }
}
