public class StaticVarr {

    // Instance variables: Yeh variables har object ke liye alag-alag hote hain aur share nahi hote.
    String instanceVar1;
    String instanceVar2;

    // Class variable (static variable): Yeh variable sabhi objects ke liye common hota hai aur class ka part hota hai.
    static int classVar = 100;

    // Static block: Yeh block tab execute hota hai jab class memory mein load hoti hai. Aur static block se pehle class variables initialize ho jaate hain. ANd static block is executed only once.
    static {
        System.out.println("Static block executed.");
        classVar = 200; // Static variables ko yahan initialize ya modify kar sakte hain
    }

    // Constructor: Yeh instance variables ko initialize karta hai.
    StaticVarr(String instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    // Instance method: Yeh method instance variables aur class variable ko display karta hai.
    public void display() {
        // Local variable: Yeh variable method ke andar declare hota hai aur sirf us method ke andar accessible hota hai.
        int localVar = 50;
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
        System.out.println("Local Variable: " + localVar);
        System.out.println("Class Variable (Static): " + classVar);
    }

    // Static method: Yeh method class ka part hota hai aur bina object create kiye call kiya ja sakta hai.
    public static void staticMethod() {
        System.out.println("Static method called.");
        System.out.println("Class Variable (Static): " + classVar);
    }

    public static void main(String[] args) {
        // StaticVarr class ke objects create kar rahe hain
        StaticVarr obj1 = new StaticVarr("Value1", "Value2");
        StaticVarr obj2 = new StaticVarr("Value3", "Value4");

        // Instance method ko call kar rahe hain
        obj1.display();
        obj2.display();

        // Static method ko call kar rahe hain
        StaticVarr.staticMethod();

        // Static variable ko directly class name se access kar rahe hain
        System.out.println("Accessing static variable directly: " + StaticVarr.classVar);
    }
}