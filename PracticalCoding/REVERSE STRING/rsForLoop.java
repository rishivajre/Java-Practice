public class RSforLoop {
    public static void main(String[] args) {
        String in = "ihsiR";
        String out = "";

        for (int i=in.length()-1; i>=0; i--) {
            out = out + in.charAt(i);
        }

        System.out.println(out);
    }
}
