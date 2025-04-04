// Base class: Shape
// This class serves as the parent class for all shapes
class Shape {
    // Method to display a generic message about area
    public void area() {
        System.out.println("Displays area");
    }
}

// Single-level Inheritance: Shape --> Triangle
// The Triangle class inherits from the Shape class
class Triangle extends Shape {
    // Method to calculate the area of a triangle
    public void area(int l, int h) {
        // Corrected formula for the area of a triangle: (1/2) * base * height
        System.out.println("Area of Triangle: " + (0.5 * l * h));
    }
}

// Multilevel Inheritance: Shape --> Triangle --> EquilateralTriangle
// The EquilateralTriangle class inherits from the Triangle class
class EquilateralTriangle extends Triangle {
    // Method to calculate the area of an equilateral triangle
    public void area(int l, int h) {
        // Corrected formula for the area of a triangle
        System.out.println("Area of Equilateral Triangle: " + (0.5 * l * h));
    }
}

// Hierarchical Inheritance: Shape --> Circle
// The Circle class inherits from the Shape class
class Circle extends Shape {
    // Method to calculate the area of a circle
    public void area(int r) {
        // Formula for the area of a circle: π * r^2
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

// Main class to demonstrate inheritance
public class singleLevelInheritance {
    public static void main(String[] args) {
        // Single-level inheritance demonstration
        Triangle t = new Triangle();
        t.area(); // Calls the area() method from the Shape class
        t.area(6, 5); // Calls the area(int, int) method from the Triangle class

        // Multilevel inheritance demonstration
        EquilateralTriangle et = new EquilateralTriangle();
        et.area(4, 4); // Calls the overridden area(int, int) method from the EquilateralTriangle class

        // Hierarchical inheritance demonstration
        Circle c = new Circle();
        c.area(7); // Calls the area(int) method from the Circle class
    }
}