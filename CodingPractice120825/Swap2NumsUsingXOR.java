public class Swap2NumsUsingXOR {
    public static void main(String[] args) {
        int a = 10;
        int b = 220;

        a = a^ b;
        b = a^ b;
        a = a^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
