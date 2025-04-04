public class RecursionCalls {
    public static int factorial(int n) {
        //Base case
        if(n==0 || n==1){
            return 1;
        }
        //Recursive case
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);

        int n = 5 ;
        for (int i=0; i<n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;

        //recursive call
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
