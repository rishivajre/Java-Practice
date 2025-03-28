public class polymorphism {
    // Base class
static class Shape {
    // Method to calculate area
    public void calculateArea() {
        System.out.println("Calculating area of shape");
    }
}

// Derived class for Circle
static class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method for Circle
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Derived class for Rectangle
static class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea method for Rectangle
    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // Demonstrating polymorphism
        circle.calculateArea(); // Calls Circle's calculateArea method
        rectangle.calculateArea(); // Calls Rectangle's calculateArea method
    }
}
}
