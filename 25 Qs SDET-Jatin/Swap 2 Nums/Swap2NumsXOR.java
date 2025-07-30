public class Swap2NumsXOR {
    public static void main (String[] args) {
        // Swapping two numbers using XOR operation
        // This method does not require a temporary variable and uses bitwise XOR to swap values.
        // It is a common technique in programming interviews.
        // Note: This method works only for integer types and may not be suitable for all data
        // types due to potential overflow issues.
        // XOR (exclusive OR) operation is a bitwise operation that can be used to swap two numbers without using a temporary variable.
        // It works by performing the XOR operation on the two numbers in a way that their values
        // are exchanged without needing additional storage.
        // XOR behind the scenes:
        // 1. a = a ^ b;  // a now holds the XOR of both numbers which is a combination of bits from both numbers i.e. 
        // a = 10 (1010 in binary) and b = 20 (10100 in binary) results in a = 30 (11110 in binary)
        // 2. b = a ^ b;  // b now holds the original value of a, because XORing the result with b gives us the original a  
        // 3. a = a ^ b;  // a now holds the original value of b, because XORing the result with the new b gives us the original b
        // This method is efficient and does not require additional memory for a temporary variable.

        System.out.println("Swapping two numbers using XOR operation\n");
        System.out.println("Before swapping:");
        System.out.println("val of a : 10");
        System.out.println("val of b : 20\n");
        int a = 10;
        int b = 20;

        a = a^b;
        b = a^b;
        a = a^b;
        // how Exclusive OR works: XOR operation will swap the values without using a temporary variable.
        // Example:
        // a = 10 (1010 in binary)
        // b = 20 (10100 in binary)
        // a = 30 (11110 in binary)
        // b = 10 (1010 in binary)
        // a = 20 (10100 in binary)

        System.out.println("val of a : " + a);
        System.out.println("val of b : " + b);
    }
}
