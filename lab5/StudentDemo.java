class Student {
    String name;
    int mark1, mark2, mark3;

    Student(String name, int mark1, int mark2, int mark3) {
        this.name  = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    String average(int m1, int m2, int m3) {
        double avg = (m1 + m2 + m3) / 3.0;
        System.out.println("Mark 1    : " + m1);
        System.out.println("Mark 2    : " + m2);
        System.out.println("Mark 3    : " + m3);
        System.out.println("Average   : " + avg);

        if (avg >= 50) {
            return "PASSED";
        } else {
            return "FAILED";
        }
    }
    String inputName(String n) {
        this.name = n;
        return this.name;
    }
    void display() {
        System.out.println("------------------------------");
        System.out.println("Name      : " + inputName(name));
        System.out.println("Result    : " + average(mark1, mark2, mark3));
        System.out.println("------------------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Stuti", 78, 85, 90);  
        Student s2 = new Student("Tom", 30, 25, 40);  
        System.out.println("Student Result System\n");

        s1.display();
        s2.display();
    
    }
}