public class RSAConstructor {
    // Default constructor
    public RSAConstructor() {
        System.out.println("I am in the IMPLICIT constructor ");
    }

    // Parameterized constructor
    public RSAConstructor(int a, int b) {
        System.out.println("I am in the parameterized constructor");
        int c = a + b;
        System.out.println(c);
    }

    // Parameterized constructor with a string
    public RSAConstructor(String str) {
        System.out.println(str);
    }

    public void getdata() {
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RSAConstructor cd = new RSAConstructor();
        // RSAConstructor cds = new RSAConstructor("hello");
        // RSAConstructor c = new RSAConstructor(4, 5);
        // compiler will call implicit constructor if you have not defined constructor block
        // whenever you create an object constructor is called
        // block of code whenever an object is created

        cd.getdata();
    }
}