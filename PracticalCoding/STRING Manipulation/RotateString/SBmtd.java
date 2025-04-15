public class SBmtd { // Approach 3: Using StringBuilder (Flexible)
    
    public static String rotateString(String str, int k) {
        if (str == null || str.isEmpty()) return str;
        StringBuilder sb = new StringBuilder();

        k = k % str.length();

        sb.append(str.substring(k)).append(str.substring(0, k));

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abcdef";
        int k = 3;
        System.out.println(rotateString(str, k)); // defabc
    }

}


/**
 * String Rotation (left rotation)
│
├── Approach 1: Substring
│   ├── substring(k) + substring(0, k)
│   └── Easy but less efficient
│
├── Approach 2: Char[] + Reverse
│   ├── Reverse 1st part
│   ├── Reverse 2nd part
│   ├── Reverse entire
│   └── Best performance (in-place)
│
└── Approach 3: StringBuilder
    ├── Same as Approach 1
    └── Uses StringBuilder for performance

 */