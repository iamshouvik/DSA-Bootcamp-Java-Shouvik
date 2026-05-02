package com.shouvik.dsa_algomaster_io._01_arrays._03_stock_problems;

public class Q13_BestTimeToBuyAndSellStockII {
    private static int solve (int[] prices, int day, boolean holding){
        // Base case: no more days to trade
        if(day == prices.length){
            return 0;
        }

        if(holding){
            // Either sell today or skip
            int sell = prices[day] + solve(prices, day + 1, false);
            int skip = solve(prices, day + 1, true);
            return Math.max(sell, skip);
        } else {
            // Either buy today or skip
            int buy = -prices[day] + solve(prices, day + 1, true);
            int skip = solve(prices, day + 1, false);
            return Math.max(buy, skip);
        }
    }
    public static int maxProfit_approach1(int[] prices) {
        /*Time Complexity: O(2^n). At each day, we make 2 choices (buy/sell or skip), and there are n days. This creates a binary decision tree of depth n, giving us 2^n total paths to explore.
          Space Complexity: O(n). The recursion stack goes n levels deep (one level per day).*/
        return solve(prices, 0, false);
    }

    public static int maxProfit_approach2(int[] prices) {
        /*Time Complexity: O(n). We make a single pass through the prices array, doing O(1) work per day.
          Space Complexity: O(1). We only use a constant number of variables regardless of input size.*/

        // notHolding: max profit when not holding stock
        // holding: max profit when holding stock
        int notHolding = 0;
        int holding = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            int newNotHolding = Math.max(notHolding, holding + prices[i]);
            int newHolding = Math.max(holding, notHolding - prices[i]);
            notHolding = newNotHolding;
            holding = newHolding;
        }

        return notHolding;
    }

    public static int maxProfit_approach3(int[] prices) {
        /*Time Complexity: O(n). Single pass through the array with O(1) work per element.
          Space Complexity: O(1). Only one variable (profit) regardless of input size.*/
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Collect every upward price movement
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit_approach3(nums1));

        int[] nums2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit_approach3(nums2));
    }
}
