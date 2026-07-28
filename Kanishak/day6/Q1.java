// Best Time to Buy and Sell Stock - 121 problem
package day6;

// leetcode optimize solution
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}

// my approach
// class Solution {
//     public int maxProfit(int[] prices) {

//         int i = 0;
//         int j = 1;
//         int maxProfit = 0;

//         while (j < prices.length) {

//             if (prices[j] < prices[i]) {
//                 i = j;
//             } else {
//                 maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
//             }
//             j++;
//         }

//         return maxProfit;
//     }
// }

// t.c = O(n)
// s.c = O(1)