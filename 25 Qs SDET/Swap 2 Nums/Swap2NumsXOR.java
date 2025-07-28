public class Swap2NumsXOR {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("val of a : " + a);
        System.out.println("val of b : " + b);
    }
}
