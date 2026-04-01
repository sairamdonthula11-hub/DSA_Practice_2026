import java.util.HashMap;

public class TwoSum {

    /**
     * Brute Force:
     * for i : nums.size()
     * for j : nums.size()
     * if (nums[i] + nums[j] == target)
     * return [i, j];
     * Time Complexity: O(n * n)
     * Space Complexity: O(1)
     *
     * Optimized Approach:
     * Pattern: "3️. Need fast lookup / Frequency Count?
     * ✅ Pattern → HashMap / HashSet" -> HashMap / HashSet
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    /**
     *
     * @param nums
     * @param target
     * @return
     */

    public int[] twoSumOptimized(int[] nums, int target) {

        HashMap<Integer, Integer> missingPieceMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Missing Piece
            int complement = target - nums[i];

            // Checking if anyone already has this missing piece that adds up to target
            if (missingPieceMap.containsKey(complement)) {

                return new int[]{missingPieceMap.get(complement), i};

            }

            // No matches
            missingPieceMap.put(nums[i], i);

        }

        // Didn't find any
        return new int[]{-1, -1};

    }

}