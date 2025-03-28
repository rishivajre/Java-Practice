public class whiledemo {
    public static void main (String[] args) {
        int a = 0;
        System.out.println("while Lopp");

        while( a<10)
        {
            System.out.println(a);
            a += 2;
            a = a+2;
        }
        System.out.println("do-while Lopp");
        int j = 20;
        do{
            System.out.println(j);
            j++;
        }while(j<=30);
    }
}
