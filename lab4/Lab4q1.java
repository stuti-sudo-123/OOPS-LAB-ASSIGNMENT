import java.util.Scanner;
class threeDmatrix{
    static int X;
    static int Y;
    static int Z;
    static void set(int val, int x,int y,int z,int[] arr ){
        arr[x*Y*Z + y*Z + z]=val;
    }
    static int get(int x,int y,int z,int[] arr ){
        return arr[x*Y*Z + y*Z + z];
    }
}
public class Lab4q1 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter X dimension of 3d matrix:  ");
    threeDmatrix.X=sc.nextInt();
    System.out.println("Enter Y dimension of 3d matrix:  ");
    threeDmatrix.Y=sc.nextInt();
    System.out.println("Enter Z dimension of 3d matrix:  ");
    threeDmatrix.Z=sc.nextInt();
    int[] arr = new int[ threeDmatrix.X * threeDmatrix.Y * threeDmatrix.Z] ;
    threeDmatrix.set(111,3,4,5,arr);
    System.out.println("vallue at (3,4,5) is:" + threeDmatrix.get(3,4,5,arr) );
    sc.close();
   }
}
