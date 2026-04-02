import java.util.HashMap;

public class ValidAnagram {

    /**
     * Definition: a relationship between two strings where both contain the exact same characters with the same frequency, but in a different order.
     * For example, "listen" and "silent" are anagrams because they both use the letters 'l', 'i', 's', 't', 'e', and 'n' exactly once
     */

    /**
     * Brute Force:
     * sort(str1) == sort(str2)
     * return true else return false
     * Time Complexity: O(n log n) (Depending on the sorting algorithm and programming language
     * Space Complexity: O(1)
     */

    /**
     * Optimized Approach-1 (Input doesn't contain Unicode characters):
     * Pattern: "3️. Need fast lookup / Frequency Count?
     * ✅ Pattern → HashMap / HashSet", Array Counting (Optimized Hashing)"
     * Time Complexity: O(n)
     * Space Complexity: O(1) (Constant space, 26 for all inputs)
     */

    /**
     *
     * @param str1
     * @param str2
     * @return
     */

    public boolean areAnagramAscii(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {

            return false;

        }

        int[] asciiArrayCount = new int[26];

        for (int i = 0; i < str1.length(); i++) {

            // Use the ASCII value of a character as an index of the array,
            // that's why subtract with 'a' which rounds the value to the index of the array for each small alphabet
            asciiArrayCount[str1.charAt(i) - 'a']++;
            asciiArrayCount[str2.charAt(i) - 'a']--;

        }

        for (int i : asciiArrayCount) {

            if (i != 0) {

                return false;

            }

        }

        // Valid anagram
        return true;

    }

    /**
     * Optimized Approach:
     * Pattern: "3️. Need fast lookup / Frequency Count?
     * ✅ Pattern → HashMap / HashSet", Valid Anagram, HashMap
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    /**
     *
     * @param str1
     * @param str2
     * @return
     */

    public boolean areAnagramUnicode(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {

            return false;

        }

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str1.toCharArray()) {

            // update the frequency of each character of a string
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        }

        for (char c : str2.toCharArray()) {

            if (!frequencyMap.containsKey(c)) {

                return false;

            }

            frequencyMap.put(c, frequencyMap.get(c) - 1);

            // Make the hashmap empty when it confirms that the character is aligning with the conditions of a anagram
            if (frequencyMap.get(c) == 0) {

                frequencyMap.remove(c);

            }

        }

        return frequencyMap.isEmpty();

    }

}
