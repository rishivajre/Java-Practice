public class Swap2NumsTempVar {

    public static void main(String[] args) {
        int a = 101;
        int b = 22;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        
    }
}