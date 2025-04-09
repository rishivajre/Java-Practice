package accessmodifiers;

public class SamePackageAccess {
    
    public static void main (String[] args) {
        AccessModifiersExample eg = new AccessModifiersExample();

        // Accessing public field
        System.out.println("Public Field: " + eg.pf); // Accessible from anywhere
        //System.out.println(eg.pf3); // Accessible within the same package only
        System.out.println(eg.df); // Accessible within the same package only

        //Accessing methods
        eg.publicMethod(); // Accessible from anywhere
        //eg.privateMethod(); // Accessible only within this class
        eg.protectedMethod(); // Accessible within the same package only
        eg.defaultMethod(); // Accessible within the same package only
    }
}
