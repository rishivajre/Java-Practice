// Convert Input String (e.g., "abcd") to Repeated Characters (e.g., "aabbccdd") 
// Using Loop with StringBuilder (Simple)
   
public class RepeatCharSB { 
     public String repeatString(String str) {
        if (str == null || str.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()){
            sb.append(ch).append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        RepeatChar rs = new RepeatChar();
        String result = rs.repeatString(str);
        System.out.println(result);
    }
}
