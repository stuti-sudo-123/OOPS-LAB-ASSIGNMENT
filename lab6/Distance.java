import java.util.Scanner;

class Point3D {
    Scanner sc = new Scanner(System.in);
    int x, y, z;
    Point3D() {
        x = y = z = 0;
    }
    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void input() {
        System.out.print("Enter x y z: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
    }
    void display() {
        System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
    }
    double distance(Point3D p) {
        int dx = x - p.x;
        int dy = y - p.y;
        int dz = z - p.z;

        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
}

public class Distance {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D();
        p1.input();
        p2.input();
        p1.display();
        p2.display();
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        }
}