class Student {
    String name;
    int age;
    int marks;
    String city;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
        System.out.println(this.city);
    }

    Student (Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        this.marks = s2.marks;
        this.city = s2.city;
    }

    Student(int marks, String city){
        
        this.marks = marks;
        this.city = city;
    }
}

public class Oops02 {
    public static void main(String[] args) {
        Student s1 = new Student(88, "Raipur");
        s1.name = "Rishi";
        s1.age = 28;
        
        s1.printInfo();

        Student s2 = new Student(99,"Bengaluru");
        s2.printInfo();
        s2.marks = 55;
        s2.city = "Nagpur";
    }
}