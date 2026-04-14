/*As an admin,I want to initialize  employee/trainer details directly So that I can avoid assigning values manually.*/

// Employee class to store employee details using constructor
class Employee {
    // Declare variables to store employee data
    int empId;
    String empName;
    double salary;

    // static variable shared by all employee objects
    static String company = "IBM";

    // constructor to initialize employee data
    Employee(int id, String name, double sal) {
        // assign values to variables
        empId = id;
        empName = name;
        salary = sal;
    }

    // method to display employee details
    void display() {
        System.out.println("\nEmployee ID: " + empId);// print employee id
        System.out.println("Name: " + empName);// print employee name
        System.out.println("Salary: " + salary);// print employee salary
        System.out.println("Company: " + company);// print company name
    }

    // Temporary main method (for running this code)
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Abhishek Maurya", 50000);
        Employee e2 = new Employee(2, "Aman", 40000);
        e1.display();
        e2.display();
    }
}
