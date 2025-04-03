public class PrimeNumber {
    //Approach 01: Basic Iteration
    public static boolean isPrimeIterative(int num) {
        if (num <=1) return false;
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        } return true; // Prime if no divisors found
    }

    //Approach 02: Optimized Iteration (up to sqrt(num))
    public static boolean isPrimeOptimized(int num) {
        if (num<=1) return false;
        if (num == 2) return true; // 2 is prime
        if (num % 2 == 0) return false; // Exclude even numbers greater than 2
        for (int i=3; i<=Math.sqrt(num); i+=2) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any odd number up to sqrt(num)
            }
        }
        return true; // Prime if no divisors found
    }

    public static void main(String[] args) {
        //int num = 23; // Assign a single integer value
        System.out.println("Basic Check: ");
        for (int num : new int[]{23, 15, 7, 10, 19}) { // Example array of numbers
            
            if (isPrimeIterative(num)) {
            System.out.println(num + " is a prime number!");
            } else {
            System.out.println(num + " is not a prime number!");
            }
        }
        System.out.println("Optimized Check: ");
        for (int num : new int[] {56,23,69,41,43,19}) {
            
            if (isPrimeOptimized(num)) {
                System.out.println(num + " is a prime number!");
            } else {
                System.out.println(num + " is not a prime number!");
            }
        }
    }
}
