public class Swap2NUmsTemp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a is: " + a);
        System.out.println("b is: " + b + "\n");

        System.out.println("Swapping a and b\n");

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
    }
}