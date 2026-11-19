public class BestTimeToBuyAndSellStock {

    public static long maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minimumPrice = prices[0];
        long maximumProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            long profit = (long) prices[i] - minimumPrice;
            maximumProfit = Math.max(maximumProfit, profit);
            minimumPrice = Math.min(minimumPrice, prices[i]);
        }

        return maximumProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: " + maxProfit(prices));

        int[] decreasingPrices = {7, 6, 4, 3, 1};
        System.out.println("Decreasing prices profit: " + maxProfit(decreasingPrices));
    }
}
