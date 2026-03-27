class Course {
    int id;
    String description;
    int duration;
    double fees;
    Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }
    void GetData() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fees: " + fees);
        System.out.println("----------------------");
    }
}
public class TestCourse {
    public static void main(String[] args) {

        Course[] courses = new Course[5];
        courses[0] = new Course(101, "Java Programming", 6, 15000);
        courses[1] = new Course(102, "Python", 4, 12000);
        courses[2] = new Course(103, "Web Development", 5, 14000);
        courses[3] = new Course(104, "Data Science", 8, 20000);
        courses[4] = new Course(105, "Machine Learning", 7, 22000);
        for (int i = 0; i < courses.length; i++) {
            courses[i].GetData();
        }
    }
}