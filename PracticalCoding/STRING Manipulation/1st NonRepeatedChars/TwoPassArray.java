public class TwoPassArray { //Two-Pass Array (Efficient)
    public static Character firsCharacter (String str) {
        if (str == null || str.isEmpty()) return null;
        int[] count = new int[256]; // Assuming ASCII
        for (char ch : str.toCharArray()) count[ch]++;
        for (char ch : str.toCharArray()) {
            if (count[ch] == 1) return ch;
        }
        return null;
    }

    public static void main (String[] args) {
        String str = "aannddp";
        System.out.println(firsCharacter(str));
    }
    
}

/**
     +-----------------------------+
    |     First Non-Repeated      |
    |       Character Logic       |
    +-----------------------------+
             |
             v
    +-------------------+
    | Edge Case Check   |
    +-------------------+
             |
             v
    +-------------------------+
    | Frequency Array [256]   |
    +-------------------------+
             |
             v
    +----------------------------+
    | 1st Pass: Count Chars      |
    +----------------------------+
             |
             v
    +-----------------------------+
    | 2nd Pass: Find First with 1 |
    +-----------------------------+
             |
             v
    +------------------+
    | Return Character |
    +------------------+

 */