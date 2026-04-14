
/*Main class to run the whole program*/
public class Main {

    public static void main(String[] args) {
        System.out.println("For Student.java");
        // creating Student object with student details
        Student s1 = new Student(10, "Abhishek Maurya", 70);
        s1.display();
        s1.formatName();
        s1.showMarksArray();
        System.out.println();
        System.out.println();

        System.out.println("CollegeStudent.java");
        System.out.println();
        // demonstrating inheritance using CollegeStudent
        CollegeStudent s2 = new CollegeStudent(33, "Arnav", 50);
        CollegeStudent s3 = new CollegeStudent(34, "Abhishek", 89.0);
        // s1.showDetails();
        System.out.println("General Student:");
        s2.showDetails();
        System.out.println("\nCollege Student:");
        s3.showDetails();
        System.out.println();
        System.out.println();

        // creating Employee objects
        System.out.println("For Employee.java");
        Employee e1 = new Employee(1, "Abhishek Maurya", 30000);
        Employee e2 = new Employee(2, "Aman", 35000);
        // call display funtion
        e1.display();
        e2.display();
        System.out.println();
        System.out.println();

        // using Product class (encapsulation)
        System.out.println("For Product.java");
        System.out.println();
        Product p = new Product();
        p.setName("Mobile");
        p.setPrice(50000);
        // getting values
        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Price: " + p.getPrice());
        System.out.println();
        System.out.println();

        // demonstrating method overloading
        System.out.println("For ProductBilling.java");
        // System.out.println();
        ProductBilling bill = new ProductBilling();
        // call the overloading method accept parameters
        bill.calculateBill(100);
        bill.calculateBill(100, 200);
        bill.calculateBill(100, 200, 300);
    }
}
