
public class BestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {

        if (prices.length == 0)
            return 0;

        int profit = 0, buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (buyPrice < prices[i]) {
                profit += (prices[i] - buyPrice);
                buyPrice = prices[i];
            } else
                buyPrice = prices[i];
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(maxProfit(prices));

        System.exit(0);
    }
}
