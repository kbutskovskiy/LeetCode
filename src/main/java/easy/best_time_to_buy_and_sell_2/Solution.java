package easy.best_time_to_buy_and_sell_2;

public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int profit = 0, buyPrice, sellPrice;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i + 1] > prices[i]) {
                buyPrice = prices[i];
                int j = i;
                while (j + 1 < prices.length && prices[j+1] > prices[j]) {
                    ++j;
                }
                sellPrice = prices[j];
                profit += sellPrice - buyPrice;
                i = j;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(new Solution().maxProfit(prices));
    }
}
