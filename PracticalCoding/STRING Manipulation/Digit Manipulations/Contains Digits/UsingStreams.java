public class UsingStreams {
    //Check of contains only digits via Stream
    public static boolean containsOnlyDigits(String str) {
        if (str == null || str.isEmpty()) return false;
        
        return str.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        String str = "000";
        System.out.println(containsOnlyDigits(str));
    }
}
