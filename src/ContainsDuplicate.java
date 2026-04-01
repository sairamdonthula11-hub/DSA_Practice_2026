import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    /**
     * Brute Force:
     * for i : nums.size()
     * for j : nums.size()
     * if (nums[i] == nums[j])
     * return true;
     * Time Complexity: O(n * n)
     * Space Complexity: O(1)
     *
     * Optimized Approach:
     * Pattern: "3️. Need fast lookup / Frequency Count?
     * ✅ Pattern → HashMap / HashSet", "Contains Duplicate, HashSet (Primary)
     * We can first sort and derive the solution, but it is secondary approach"
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    /**
     *
     * @param nums
     * @return
     */

    public int[] getDuplicateValueFrequency(int[] nums) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {

            // If the number is already preset in map then get override the existing value by adding the existing value with '1'
            // Else add new key, number and value as '0'
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

        }

        for (Map.Entry<Integer, Integer> keyValue : frequencyMap.entrySet()) {

            if (keyValue.getValue() > 1) {

                // Found the number which is repeating. Returning that number with frequency
                return new int[]{keyValue.getKey(), keyValue.getValue()};

            }

        }

        // No repeating number(s)
        return new int[]{-1, -1};

    }

}
