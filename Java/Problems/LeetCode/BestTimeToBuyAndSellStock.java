
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        if (prices.length == 0)
            return 0;

        int diff = 0, buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (buyPrice < prices[i])
                diff = Math.max(diff, prices[i] - buyPrice);

            else
                buyPrice = prices[i];
        }

        return diff;
    }

    public static void main(String[] args) {

        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };

        System.out.println(maxProfit(prices));

        System.exit(0);
    }
}
