package Arrays;

public class BuyAndSellStock_121 {
    public static int buyAndSellStock(int prices[]) {
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStock(prices));
    }

}
