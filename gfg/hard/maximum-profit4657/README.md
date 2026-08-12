# Stock Buy and Sell – Max K Transactions Allowed

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array prices[], where prices[i] represents the price of a stock on the i-th day, and an integer k representing the maximum number of transactions allowed, find the maximum profit that can be earned by performing at most k transactions.

 **Note:**  A transaction consists of buying and subsequently selling a stock and new transaction can start only when the previous transaction has been completed.

 **Examples :** 

```
Input: prices[] = [10, 22, 5, 80], k = 2
Output: 87
Explaination:
1st transaction: Buy at 10 and sell at 22.
2nd transaction: Buy at 5 and sell at 80.
Total Profit will be 12 + 75 = 87.

```

```
Input: prices[] = [20, 25, 30, 40, 10, 20], k = 3
Output: 30
Explaination:
1st transaction: Buy at 20 and sell at 40. 
2nd transaction: Buy at 10 and sell at 20.
Total Profit will be 20 + 10 = 30.
```

```
Input: prices[] = [90, 80, 70, 60, 50], k = 1
Output: 0
Explaination: Selling price is decreasing continuously leading to loss. So seller cannot have any profit.
```

 **Constraints:** 
1 ≤ prices.size() ≤ 103
1 ≤ k ≤ 200
1 ≤ prices[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-12T10:15:57.511Z  

```java
class Solution {
    int maxProfit(int prices[], int k) {
        // code here
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        if (k >= n / 2) {
            int maxProfit = 0;

            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }

            return maxProfit;
        }

        int[] buy = new int[k + 1];
        int[] sell = new int[k + 1];

        Arrays.fill(buy, Integer.MIN_VALUE);
        
        for (int price : prices) {
            for (int t = 1; t <= k; t++) {
                buy[t] = Math.max(buy[t], sell[t - 1] - price);
                sell[t] = Math.max(sell[t], buy[t] + price);
            }
        }

        return sell[k];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-profit4657/1)