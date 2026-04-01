public class BestTimeToBuyAndSellStock {

    /**
     * Brute Force:
     * maxProfit = 0
     * for i : nums.size()
     * for j : nums.size()
     * if (nums[j] - nums[i] > maxProfit)
     * maxProfit = nums[j] - nums[i]
     * return maxProfit;
     * Time Complexity: O(n * n)
     * Space Complexity: O(1)
     *
     * Optimized Approach:
     * Pattern: "7️. Is it asking max/min subarray or continuous optimization?
     * ✅ Pattern → Kadane’s Algorithm", "Best Time to Buy/Sell Stock (Greedy Style)
     * (Trying to but the stock when price is low and sell when price is high. This is greedy thinking)" -> Kadane's Algorithm (Greedy Style)
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    /**
     *
     * @param stockPrices
     * @return
     */

    public int[] maximumProfit(int[] stockPrices) {

        int minPrice = Integer.MAX_VALUE;
        int minPriceDay = -1;
        int maxProfit = 0;
        int maxProfitDay = -1;

        for (int i = 0; i < stockPrices.length; i++) {

            if (stockPrices[i] < minPrice) {

                // Finds the minimum stock price in a given time frame
                minPrice = stockPrices[i];
                minPriceDay = i;

            }

            int profit = stockPrices[i] - minPrice;

            if (profit > maxProfit) {

                // Finds the day that gives maximum profit for the minimum price and stores the maximum profit
                maxProfit = profit;
                maxProfitDay = i;

            }

        }

        return new int[]{minPriceDay, maxProfitDay, maxProfit};

    }

}
