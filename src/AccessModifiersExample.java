/* Here are some tricky questions that might be asked in interviews about access modifiers in Java:

### Public
1. **What is the difference between public and other access modifiers?**
   - Public members are accessible from any other class, regardless of the package.

2. **Can a public class have private members?**
   - Yes, a public class can have private members. The class itself is accessible, but its private members are not.

### Private
1. **Can private members be accessed outside the class?**
   - No, private members are only accessible within the class they are declared in.

2. **How can you access private members of a class?**
   - Private members can be accessed using public getter and setter methods or through reflection (though reflection is generally discouraged for regular use).

3. **Can a private method be overridden?**
   - No, private methods cannot be overridden as they are not accessible outside the class.

### Protected
1. **What is the difference between protected and default access?**
   - Protected members are accessible within the same package and by subclasses in other packages. Default members are only accessible within the same package.

2. **Can a protected member be accessed in a different package without inheritance?**
   - No, protected members can only be accessed in a different package through inheritance.

3. **Can a protected method be overridden?**
   - Yes, a protected method can be overridden by a subclass.

### Default (Package-Private)
1. **What is the default access modifier in Java?**
   - If no access modifier is specified, the default access level is package-private, meaning the member is accessible only within its own package.

2. **Can default members be accessed from a subclass in a different package?**
   - No, default members are not accessible outside their own package, even to subclasses.

### General Questions
1. **What is the most restrictive access level that allows a member to be accessible to subclasses?**
   - Protected is the most restrictive access level that allows a member to be accessible to subclasses.

2. **Can you change the access level of a method in a subclass?**
   - Yes, you can change the access level of an overridden method in a subclass, but only to a less restrictive level (e.g., from protected to public).

3. **What is the access level of an interface and its members by default?**
   - An interface is implicitly public, and all its members (methods and constants) are implicitly public and abstract (methods) or public, static, and final (constants).

4. **Can a class be declared as private or protected?**
   - No, a top-level class cannot be declared as private or protected. It can only be public or package-private (default). However, inner classes can be private or protected.

5. **What happens if you try to access a private member of a class from another class?**
   - You will get a compile-time error indicating that the member has private access in the class.

These questions test a candidate's understanding of access control in Java and their ability to apply this knowledge in different scenarios. */



public class AccessModifiersExample {

    // Public variable - accessible from any other class
    public String publicVariable = "I am public";

    // Private variable - accessible only within this class
    private String privateVariable = "I am private";

    // Protected variable - accessible within the same package and other subclasses, but not to classes in other packages
    //why to use protected variable? - to allow subclasses to access the variable while restricting access to other classes
    protected String protectedVariable = "I am protected";

    /* Default variable - accessible within the same package & 
    to other classes in the same package, but not to classes in other packages!*/
    String defaultVariable = "I am default";

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing all variables within the same class
        System.out.println(example.publicVariable);
        System.out.println(example.privateVariable);
        System.out.println(example.protectedVariable);
        System.out.println(example.defaultVariable);
    }
}

class AnotherClassInSamePackage {
    public void accessTest() {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing variables from another class in the same package
        System.out.println(example.publicVariable);
        // System.out.println(example.privateVariable); // Not accessible
        System.out.println(example.protectedVariable);
        System.out.println(example.defaultVariable);
    }
}

class SubClass extends AccessModifiersExample {
    public void accessTest() {
        // Accessing variables from a subclass
        System.out.println(publicVariable);
        // System.out.println(privateVariable); // Not accessible
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }
}