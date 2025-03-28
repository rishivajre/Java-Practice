class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Parent name: " + name);
    }
}

public class superKeywordDemo extends Parent {
    String name;

    superKeywordDemo(String parentName, String childName) {
        super(parentName); // Call the parent class constructor
        this.name = childName;
    }

    void display() {
        super.display(); // Call the parent class method
        System.out.println("Child name: " + name);
    }

    public static void main(String[] args) {
        superKeywordDemo obj = new superKeywordDemo("ParentName", "ChildName");
        obj.display();
    }
}