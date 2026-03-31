public class BestTimeToBuyAndSellStock {

    public int[] maximumProfit(int[] stockPrices) {

        int minPrice = Integer.MAX_VALUE;
        int minPriceDay = -1;
        int maxProfit = 0;
        int maxProfitDay = -1;

        for (int i = 0; i < stockPrices.length; i++) {

            if (stockPrices[i] < minPrice) {

                minPrice = stockPrices[i]; // Finds the minimum stock price in a given time frame
                minPriceDay = i;

            }

            int profit = stockPrices[i] - minPrice;

            if (profit > maxProfit) {

                maxProfit = profit; // Finds the day that gives maximum profit for the minimum price and stores the maximum profit
                maxProfitDay = i;

            }

        }

        return new int[]{minPriceDay, maxProfitDay, maxProfit};

    }

}
