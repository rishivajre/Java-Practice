// Define the Student class
class Student {
    // Instance variables to store student details
    String name;  // Name of the student
    int age;      // Age of the student
    int marks;    // Marks of the student
    String city;  // City of the student

    // Method to print student information
    public void printInfo() {
        System.out.println("Name: " + this.name);  // Print the name
        System.out.println("Age: " + this.age);    // Print the age
        System.out.println("Marks: " + this.marks); // Print the marks
        System.out.println("City: " + this.city);  // Print the city
    }

    // Copy Constructor: Creates a new Student object by copying another Student object
    Student(Student s2) {
        this.name = s2.name;   // Copy the name
        this.age = s2.age;     // Copy the age
        this.marks = s2.marks; // Copy the marks
        this.city = s2.city;   // Copy the city
    }

    // Parameterized Constructor: Initializes marks and city
    Student(int marks, String city) {
        this.marks = marks; // Initialize marks
        this.city = city;   // Initialize city
    }
}

// Main class to test the Student class
public class Oops02 {
    public static void main(String[] args) {
        // Create the first Student object using the parameterized constructor
        Student s1 = new Student(88, "Raipur");
        s1.name = "Rishi"; // Set the name
        s1.age = 28;       // Set the age

        // Print the details of the first student
        System.out.println("Details of Student 1:");
        s1.printInfo();

        // Create the second Student object using the copy constructor
        Student s2 = new Student(s1);

        // Modify the details of the second student
        s2.marks = 55;       // Update marks
        s2.city = "Nagpur";  // Update city

        // Print the details of the second student
        System.out.println("\nDetails of Student 2:");
        s2.printInfo();
    }
}