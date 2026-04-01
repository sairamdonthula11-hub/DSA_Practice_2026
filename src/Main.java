import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Welcome!");

        /*
         * Two Sum
         */

        TwoSum twoSum = new TwoSum();

        int[] twoSumNums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] twoSumResult1 = twoSum.twoSumOptimized(twoSumNums1, target1);
        if (twoSumResult1[0] != -1 && twoSumResult1[1] != -1) {

            System.out.println(Arrays.toString(twoSumNums1) + " : Numbers, " + twoSumNums1[twoSumResult1[0]] + " and " + twoSumNums1[twoSumResult1[1]] + " adds upto target, " + target1);

        } else {

            System.out.println(Arrays.toString(twoSumNums1) + " : No Two Number Found that that adds upto target, " + target1);

        }

        int[] twoSumNums2 = {3, 2, 4};
        int target2 = 6;
        int[] twoSumResult2 = twoSum.twoSumOptimized(twoSumNums2, target2);
        if (twoSumResult2[0] != -1 && twoSumResult2[1] != -1) {

            System.out.println(Arrays.toString(twoSumNums2) + " : Numbers, " + twoSumNums2[twoSumResult2[0]] + " and " + twoSumNums2[twoSumResult2[1]] + " adds upto target, " + target2);

        } else {

            System.out.println(Arrays.toString(twoSumNums2) + " : No Two Number Found that that adds upto target, " + target2);

        }

        int[] twoSumNums3 = {3, 3};
        int target3 = 6;
        int[] twoSumResult3 = twoSum.twoSumOptimized(twoSumNums3, target3);
        if (twoSumResult3[0] != -1 && twoSumResult3[1] != -1) {

            System.out.println(Arrays.toString(twoSumNums3) + " : Numbers, " + twoSumNums3[twoSumResult3[0]] + " and " + twoSumNums3[twoSumResult3[1]] + " adds upto target, " + target3);

        } else {

            System.out.println(Arrays.toString(twoSumNums3) + " : No Two Number Found that that adds upto target, " + target3);

        }

        int[] twoSumNums4 = {2, 7, 11, 15, 17, 19, 20};
        int target4 = 1;
        int[] twoSumResult4 = twoSum.twoSumOptimized(twoSumNums4, target4);
        if (twoSumResult4[0] != -1 && twoSumResult4[1] != -1) {

            System.out.println(Arrays.toString(twoSumNums4) + " : Numbers, " + twoSumNums4[twoSumResult4[0]] + " and " + twoSumNums4[twoSumResult4[1]] + " adds upto target, " + target4);

        } else {

            System.out.println(Arrays.toString(twoSumNums4) + " : No Two Number Found that that adds upto target, " + target4);

        }


        /*
         * Best Time to Buy/Sell Stock
         */

        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStockExample = new BestTimeToBuyAndSellStock();

        System.out.println("Stocks starts from Day-1 (0th index means Day-1 and Day-0 means invalid, means no profit gain and it's your wish to buy or sell the stock");
        System.out.println("Note: The Buy or Sell Suggestions are only based on considering the given stock prices within the given time frame");

        int[] stockPricesTimeFrame1 = {7, 1, 5, 3, 6, 4};
        int[] stockPricesResult1 = bestTimeToBuyAndSellStockExample.maximumProfit(stockPricesTimeFrame1);
        int minPriceDayOfTF1 = stockPricesResult1[0] + 1;
        int maxProfitDayOfTF1 = stockPricesResult1[1] + 1;
        String maxProfitDayOfTF1Str = (maxProfitDayOfTF1 == 0) ? " You wish to sell" : "-" + maxProfitDayOfTF1;
        int maxProfitOfTF1 = stockPricesResult1[2];
        System.out.println(Arrays.toString(stockPricesTimeFrame1) + " : Buy the stock on Day-" + minPriceDayOfTF1 + ", Sell stock on Day" + maxProfitDayOfTF1Str + ", Profit Gain = " + maxProfitOfTF1);

        int[] stockPricesTimeFrame2 = {7, 6, 4, 3, 1};
        int[] stockPricesResult2 = bestTimeToBuyAndSellStockExample.maximumProfit(stockPricesTimeFrame2);
        int minPriceDayOfTF2 = stockPricesResult2[0] + 1;
        int maxProfitDayOfTF2 = stockPricesResult2[1] + 1;
        String maxProfitDayOfTF2Str = (maxProfitDayOfTF2 == 0) ? " You wish to sell" : "-" + maxProfitDayOfTF2;
        int maxProfitOfTF2 = stockPricesResult2[2];
        System.out.println(Arrays.toString(stockPricesTimeFrame2) + " : Buy the stock on Day-" + minPriceDayOfTF2 + ", Sell stock on Day" + maxProfitDayOfTF2Str + ", Profit Gain = " + maxProfitOfTF2);


        /*
         * Contains Duplicate
         */

        ContainsDuplicate containsDuplicateExample = new ContainsDuplicate();

        int[] containsDuplicateNums1 = {1, 2, 3, 1};
        int[] containsDuplicateResul1 = containsDuplicateExample.getDuplicateValueFrequency(containsDuplicateNums1);
        if (containsDuplicateResul1[0] != -1 && containsDuplicateResul1[1] != -1) {

            System.out.println(Arrays.toString(containsDuplicateNums1) + ", Contains Duplicate? Yes, Value: " + containsDuplicateResul1[0] + ", Number of times repeated, " + containsDuplicateResul1[1]);

        } else {

            System.out.println(Arrays.toString(containsDuplicateNums1) + ", Contains Duplicate? No");

        }

        int[] containsDuplicateNums2 = {1, 2, 3, 4};
        int[] containsDuplicateResul2 = containsDuplicateExample.getDuplicateValueFrequency(containsDuplicateNums2);
        if (containsDuplicateResul2[0] != -1 && containsDuplicateResul2[1] != -1) {

            System.out.println(Arrays.toString(containsDuplicateNums2) + ", Contains Duplicate? Yes, Value: " + containsDuplicateResul2[0] + ", Number of times repeated, " + containsDuplicateResul2[1]);

        } else {

            System.out.println(Arrays.toString(containsDuplicateNums2) + ", Contains Duplicate? No");

        }

        int[] containsDuplicateNums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] containsDuplicateResul3 = containsDuplicateExample.getDuplicateValueFrequency(containsDuplicateNums3);
        if (containsDuplicateResul3[0] != -1 && containsDuplicateResul3[1] != -1) {

            System.out.println(Arrays.toString(containsDuplicateNums3) + ", Contains Duplicate? Yes, Value: " + containsDuplicateResul3[0] + ", Number of times repeated, " + containsDuplicateResul3[1]);

        } else {

            System.out.println(Arrays.toString(containsDuplicateNums3) + ", Contains Duplicate? No");

        }

    }

}