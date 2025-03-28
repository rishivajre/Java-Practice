public class thisDemo {
    // print the sum of global and local variables
    int a = 10; // global variables
    int b = 20; // global variables

    void sum(int a, int b) { 
        // local 👆 variables a and b are passed as arguments to the method sum
        System.out.println("Sum of local variables: " + (a + b)); 
        // sum of local variables, local variables are passed as arguments
        System.out.println("Sum of global variables: " + (this.a + this.b)); 
        // sum of global variables, this keyword is used to refer to the global variables
    }

    public static void main(String[] args) {
        thisDemo obj = new thisDemo();
        obj.sum(100, 200); // sum of local variables
    }
    
}
