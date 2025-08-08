public class Swap2NumsXOR {
    public static void main(String[] args) {
        int a = 222;
        int b = 22;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
