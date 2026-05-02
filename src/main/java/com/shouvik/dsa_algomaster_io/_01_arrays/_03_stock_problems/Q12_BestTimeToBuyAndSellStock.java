package com.shouvik.dsa_algomaster_io._01_arrays._03_stock_problems;

public class Q12_BestTimeToBuyAndSellStock {
    public static int maxProfit_approach1(int[] prices) {
        /*Time Complexity: O(n^2). We have two nested loops. The outer loop runs n times, and for each iteration, the inner loop runs up to n-1 times. This gives us roughly n * n / 2 comparisons, which is O(n^2).
          Space Complexity: O(1). We only use a couple of variables regardless of input size.*/
        int maxProfit = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] < prices[j]){
                    int profit = prices[j] - prices[i];
                    if(maxProfit < profit){
                        maxProfit = profit;
                    }
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfit_approach2(int[] prices) {
        /*Time Complexity: O(n). We make a single pass through the array, doing O(1) work at each step.
        Space Complexity: O(1). We only use two variables (minPrice and maxProfit) regardless of input size.*/

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit_approach2(nums1));

        int[] nums2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit_approach2(nums2));
    }
}
