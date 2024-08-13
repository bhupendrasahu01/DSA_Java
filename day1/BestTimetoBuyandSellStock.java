package day1;

public class BestTimetoBuyandSellStock {


    //OP: Solution Most vote 1
    class Solution {
        public int maxProfit(int[] prices) {
            int lsf = Integer.MAX_VALUE;
            int op = 0;
            int pist = 0;
            
            for(int i = 0; i < prices.length; i++){
                if(prices[i] < lsf){
                    lsf = prices[i];
                }
                pist = prices[i] - lsf;
                if(op < pist){
                    op = pist;
                }
            }
            return op;
        }
    }

    //OP: Solution Most vote 2
    class Solution2 {
        public int maxProfit(int[] prices) {
            int min_price = prices[0];
            int maxprof = 0;
    
            for(int i=1;i<prices.length;i++){
                maxprof = Math.max(maxprof,prices[i]-min_price);
                min_price = Math.min(prices[i],min_price);
            }
    
            return maxprof;
        }
    }

    public int answer(int prices[]) {
        // int arr = [2, 4, 6,8]
        if (prices.length == 1)
            return 0;
        int profit = 0;
        int minPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[minPrice]< prices[i]) {
                profit = Math.max(profit, prices[i]- prices[minPrice]);
            } else {
                minPrice = i;
            }
        }
        return profit;
    }

    public static void main(String[] args) {

        BestTimetoBuyandSellStock bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
        int prices[] = { 5,9,1 };
        int result = bestTimetoBuyandSellStock.answer(prices);
        System.out.println(result);

    }

}

// Code
// Testcase
// Testcase
// Test Result
// 121. Best Time to Buy and Sell Stock
// Easy
// Topics
// Companies
// You are given an array prices where prices[i] is the price of a given stock
// on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock
// and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you
// cannot achieve any profit, return 0.

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
// 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you
// must buy before you sell.
// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

// Constraints:

// 1 <= prices.length <= 105
// 0 <= prices[i] <= 104