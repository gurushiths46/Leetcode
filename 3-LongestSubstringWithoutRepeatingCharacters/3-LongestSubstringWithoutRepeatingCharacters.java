// Last updated: 09/07/2026, 11:50:58
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;  

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            
            charIndexMap.put(currentChar, end);

            
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
