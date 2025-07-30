public class Swap2NumsMath {
    public static void main (String [] args) {
        int a = 10;
        int b = 110;
        System.out.println("val of a : " + a);
        System.out.println("val of b : " + b + "\n");

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("val of a : " + a);
        System.out.println("val of b : " + b);
    }
}
