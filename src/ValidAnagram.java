import java.util.*;

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
     * Optimized Approach-2 (Input contains Unicode characters):
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


    /**
     * Brute Force:
     * visited = boolean array
     *
     * for i = 0 to n-1:
     *     if visited[i] continue
     *
     *     create new group
     *     add strs[i] to group
     *     mark visited[i] = true
     *
     *     for j = i+1 to n-1:
     *         if not visited[j] AND areAnagrams(strs[i], strs[j]):
     *             add strs[j]
     *             mark visited[j] = true
     *
     *     add group to result
     * Time Complexity: O(n * n * k log k)
     * Space Complexity: O(n)
     */


    /**
     * Optimized Approach-1:
     * Pattern: "3️. Need fast lookup / Frequency Count?
     * ✅ Pattern → HashMap / HashSet", "Group Anagrams, HashMap (Grouping) and
     * Transformation (Sorting / Frequency Encoding)"
     * Time Complexity: O(N * K log K)
     * Space Complexity: O(N * K)
     */

    /**
     *
     * @param strs
     * @return
     */

    public List<List<String>> groupAnagramsOptimized1(String[] strs) {

        if (strs.length < 1) {

            // Empty string array
            return new ArrayList<>();

        }

        Map<String, List<String>> anagramPairs = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String sortedString = new String(chars);

            // Group the matched strings after sorting and add in list with key as sorted string in a hashmap
            anagramPairs.putIfAbsent(sortedString, new ArrayList<>());
            // Add all matching elements along with newly added key element
            anagramPairs.get(sortedString).add(str);

        }

        return new ArrayList<>(anagramPairs.values());

    }


    /**
     * Optimized Approach-2:
     * Pattern: "3️. Need fast lookup / Frequency Count?
     * ✅ Pattern → HashMap / HashSet", "Group Anagrams, HashMap (Grouping) and
     * Transformation (Sorting / Frequency Encoding)"
     * Time Complexity: O(N * K)
     * Space Complexity: O(N * K)
     */

    /**
     *
     * @param strs
     * @return
     */

    public List<List<String>> groupAnagramsOptimized2(String[] strs) {

        if (strs.length < 1) {

            // Empty string array
            return new ArrayList<>();

        }

        int[] asciiRecord = new int[26];

        Map<String, List<String>> anagramPairs = new HashMap<>();

        for (String str : strs) {

            for (int i = 0; i < str.length(); i++) {

                // Make all characters of a string with frequency (ASCII Records, chars with frequency)
                asciiRecord[str.charAt(i) - 'a']++;

            }

            StringBuilder frequencyString = new StringBuilder();

            for (int j = 0; j < 26; j++) {

                if (asciiRecord[j] > 0) {

                    /*
                     * Instead of sorting we create the string with frequency of each character and make it a frequency string
                     * Example: "eat" => e1a1t1
                     */
                    char temp = (char) (j + 'a');

                    frequencyString.append(temp);
                    frequencyString.append(asciiRecord[j]);

                    // Make the array neutral so that next string can update
                    asciiRecord[j] = 0;

                }

            }

            // Group the matched strings after sorting and add in list with key as sorted string in a hashmap
            anagramPairs.putIfAbsent(frequencyString.toString(), new ArrayList<>());
            // Add all matching elements along with newly added key element
            anagramPairs.get(frequencyString.toString()).add(str);

        }

        return new ArrayList<>(anagramPairs.values());

    }

}
