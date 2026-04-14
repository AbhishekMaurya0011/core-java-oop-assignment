/*As an admin, I want to create a student object so that I can store and display student Information.*/
// package com.milestone.models;
// 
// Define public class   
class Student {

    // Declare variables to store student data
    int rollNo;
    String name;
    double marks;

    // constructor of class to initialize values
    Student(int r, String n, double m) {
        // assigning values to variables
        rollNo = r;
        name = n;
        marks = m;
    }

    // method to show student details
    void display() {
        System.out.println("Roll No: " + rollNo);// print Roll number
        System.out.println("Name: " + name);// print name
        System.out.println("Marks: " + marks);// print marks
    }

    /*
     * As an admin, I want to format the student name so that I can display it in
     * different formats.
     */

    // method to show name in different formats
    void formatName() {
        System.out.println("\nOriginal: " + name);// print original name
        System.out.println("Uppercase: " + name.toUpperCase());// print name in uppercase
        System.out.println("Lowercase: " + name.toLowerCase());// print name in lowercase
        System.out.println("Length: " + name.length());// print length of name
    }

    // Temporarily testing the value
    public static void main(String[] args) {
        Student s = new Student(02, "Abhishek Maurya", 98);
        s.display();
        s.formatName();
        s.showMarksArray();
    }

    /*
     * As an admin, I want to store marks of 5 students so that I can display them
     * one by one.
     */

    // method to store and print marks of 5 students
    void showMarksArray() {
        // Declare and initialize an integer array to store marks of 5 students
        int marksArr[] = { 80, 75, 90, 85, 70 };

        // print heading before displaying marks
        System.out.println("\nMarks of 5 students:");
        // loop starts from index 0 and runs till last index of array
        for (int i = 0; i < marksArr.length; i++) {
            // print each element of array using index i
            System.out.println(marksArr[i]);
        }
    }
}
