public class ArmstrongNumUsingMathPow {
    /*
     * An Armstrong Number is a number in which the sum of the cubes of each digit
     * is equal to the number itself. For ex: 371 = 3*3*3 + 7*7*7 + 1*1*1
     * The sum of the cubes is 3,7,1 is equal to 371.Another example is 153
     */
    public static void main(String[] args) {
        int num = 371;
        int actualNum = num;
        double result = 0;

        while (actualNum != 0) {
            int n = actualNum % 10;
            result = result + Math.pow(n, 3);
            actualNum /= 10;
        }
        if (result == num) {
            System.out.println(num + " is an Armstrong NUmber");
        } else {
            System.out.println("Not an Armstrong Number!!");
        }
    }
}
