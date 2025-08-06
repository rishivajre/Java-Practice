public class ReverseNumberUsingStringBuilder {

    public static int reverse(int num) {
        StringBuilder sb = new StringBuilder();
        int sign = num < 0  ? -1 : 1;
        num = Math.abs(num);

        sb.append(num);
        sb.reverse();

        try {
            return (Integer.parseInt(sb.toString())*sign);
        } catch (NumberFormatException e) {
            return 0; // Over-UnderFlow management
        }
    }

    public static void main(String[] args) {
        int num = -234;
        System.out.println(reverse(num));
    }
}