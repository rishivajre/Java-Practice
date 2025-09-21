import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNoRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abbcabcbb")); // abc
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // b
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // wke
        System.out.println(lengthOfLongestSubstring("ddvdf"));     // vdf
    }

    public static String lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        int startIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            // if(map.containsKey(s.charAt(right))) {
            // left = Math.max(left, map.get(s.charAt(right)) + 1);
            // }
            left = Math.max(left, map.getOrDefault(s.charAt(i), -1) + 1);

            map.put(s.charAt(i), i);

            maxLen = Math.max(maxLen, i - left + 1);
        }

        //return maxLen;
        return s.substring(startIndex, startIndex + maxLen);
    }

}
