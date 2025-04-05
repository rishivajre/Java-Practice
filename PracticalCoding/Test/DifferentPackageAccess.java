package test;

import accessmodifiers.AccessModifiersExample;

public class DifferentPackageAccess extends AccessModifiersExample {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing fields
        System.out.println(example.publicField); // Accessible
        // System.out.println(example.privateField); // Not accessible
        // System.out.println(example.protectedField); // Not accessible without inheritance
        // System.out.println(example.defaultField); // Not accessible

        // Accessing methods
        example.publicMethod(); // Accessible
        // example.privateMethod(); // Not accessible
        // example.protectedMethod(); // Not accessible without inheritance
        // example.defaultMethod(); // Not accessible

        // Accessing protected members through inheritance
        DifferentPackageAccess inheritedExample = new DifferentPackageAccess();
        System.out.println(inheritedExample.protectedField); // Accessible through inheritance
        inheritedExample.protectedMethod(); // Accessible through inheritance
    }
}