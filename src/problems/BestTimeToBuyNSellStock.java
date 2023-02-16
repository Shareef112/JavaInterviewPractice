package problems;

public class BestTimeToBuyNSellStock {
    public static void main(String[] args) {
        int[] prices ={2,4,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int profit = 0, min = prices[0];
        for(int i = 1; i < prices.length; i++){
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
