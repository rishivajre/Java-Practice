
public class ArrayManipulation {
    public static void main(String[] args) {
        // Create an array of Object type to hold different types of elements
        Object[] arrf = {
            4545,                // Integer
            "yy",                // String
            new Runnable() {     // Anonymous function (Runnable)
                @Override
                public void run() {
                    System.out.println("Running...");
                }
            },
            true,                // Boolean
            null,                // Null
            null,                // Another null
            new Object(),        // Generic Object
            new Object() {       // Anonymous Object with a method
                void key() {
                    System.out.println("Key method");
                }
            }
        };

        // Check if arrf is an instance of Object[]
        System.out.println(arrf instanceof Object[]); // true
    }
}