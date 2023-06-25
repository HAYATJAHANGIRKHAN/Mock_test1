package Mocktest1;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        // Step 1: Create a map to store the frequency of each character
        Map<Character, Integer> freq = new HashMap<>();

        // Step 2: Iterate through the string and update the frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 3: Iterate through the string again and find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq.get(c) == 1) {
                return i;
            }
        }

        // Step 4: If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(firstUniqChar(s1));    // Output: 0
        System.out.println(firstUniqChar(s2));    // Output: 2
        System.out.println(firstUniqChar(s3));    // Output: -1
    }
}
