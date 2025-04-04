public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";

        t1.printColor();
    }
}

class Shape {
    String color;
}

class Triangle extends Shape {
 
    public void printColor(){
        System.out.println(color);
    }
}