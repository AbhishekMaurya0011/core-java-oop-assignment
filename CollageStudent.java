/*As an admin, I want to distinguish between general students and college students so that I can reuse common student details.  */

// CollegeStudent class is child class of Student (Inheritance)
// Child class
class CollegeStudent extends Student {

    CollegeStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks); // Parent constructor call
    }

    void showDetails() {
        super.display(); // reuse parent method
        // System.out.println("This is a College Student");
    }
}

public class CollageStudent { // Note: Rename file to CollegeStudent.java to match the corrected logic
    public static void main(String[] args) {
        CollegeStudent s2 = new CollegeStudent(03, "Aman", 97);
        CollegeStudent s3 = new CollegeStudent(05, "Abhishek", 95);

        System.out.println("General Student:");
        s2.showDetails();
        System.out.println("\nCollege Student:");
        s3.showDetails();
    }
}