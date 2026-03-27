class Teacher {
    int id;
    String name;
    String subject;
    Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
class Student extends Teacher {
    int marks; 
    String grade; 
    Student(int id, String name, String subject, int marks, String grade) {
        super(id, name, subject); 
        this.marks = marks;
        this.grade = grade;
    }

    void displayStudent() {
        super.displayTeacher(); 
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Student s = new Student(1, "Rahul", "Math", 85, "A");

        System.out.println("Student Details:");
        s.displayStudent();
    }
}