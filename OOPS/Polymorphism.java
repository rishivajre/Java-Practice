// Demonstrate polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student();
        s1.name = "Rishi"; // Set the name
        s1.age = 29;       // Set the age

        // Call the overloaded method with two parameters
        s1.printInfo(s1.name, s1.age); 
        // This will call the method with (String, int) parameters
    }
}

// Define the Student class
class Student {
    // Instance variables to store student details
    String name; // Name of the student
    int age;     // Age of the student

    // Overloaded method to print only the name
    public void printInfo(String name) {
        System.out.println(name); // Print the name
    }

    // Overloaded method to print only the age
    public void printInfo(int age) {
        System.out.println(age); // Print the age
    }

    // Overloaded method to print both name and age
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age); // Print the name and age
    }
}