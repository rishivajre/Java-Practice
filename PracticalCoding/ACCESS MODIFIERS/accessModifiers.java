package accessmodifiers;
public class accessModifiers {
    // Public field: Accessible from anywhere
    public String pf = "Public Field";

    // Private field: Accessible only within this class
    private String pf2 = "Private Field";

    // Protected field: Accessible within the same package and subclasses
    protected String pf3 = "Protected Field";

    // Default field: Accessible only within the same package
    String df = "Default Field";

    // Public method: Accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method: " + pf);
    }

    // Private method : Accessible only within this class
    private void privateMethod() {
        System.out.println("Private Method: Accessible only within this class");
        System.out.println("Private Method: " + pf2);
    }

    // Protected method: Accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method: " + pf3);
    }

    //Default method: Accessible only within the same package
    void defaultMethod() {
        System.out.println("Default Method: " + df);
    }

    // Method to demonstrate access within the same class
    public void demonstrateAccess() {
        System.out.println("Accessing fields and methods within the same class:");
        System.out.println("Public Field: " + pf);
        System.out.println("Private Field: " + pf2);
        System.out.println("Protected Field: " + pf3);
        System.out.println("Default Field: " + df);

        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }





}
