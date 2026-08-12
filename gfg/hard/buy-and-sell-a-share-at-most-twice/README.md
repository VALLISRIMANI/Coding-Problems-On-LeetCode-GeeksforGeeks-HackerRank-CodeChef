# Stock Buy and Sell – Max 2 Transactions Allowed

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

In daily share trading, a trader buys shares and sells them on the same day. If the trader is allowed to make  **at most**   **2** transactions in a day, find out the  **maximum**  profit that a share trader could have made.

You are given an array  **prices[]**  representing stock prices throughout the day. Note that the second transaction can only start after the first one is complete (buy->sell->buy->sell).

 **Examples:** 

```
Input: prices[] = [10, 22, 5, 75, 65, 80]
Output: 87
Explanation: 
Trader will buy at 10 and sells at 22. 
Profit earned in 1st transaction = 22 - 10 = 12. 
Then he buys at 5 and sell at 80. 
Profit earned in 2nd transaction = 80 - 5 = 75. 
Total profit earned = 12 + 75 = 87. 
```

```
Input: prices[] = [2, 30, 15, 10, 8, 25, 80]
Output: 100
Explanation: 
Trader will buy at 2 and sells at 30. 
Profit earned in 1st transaction = 30 - 2 = 28. 
Then he buys at 8 and sell at 80. 
Profit earned in 2nd transaction = 80 - 8 = 72. 
Total profit earned = 28 + 72 = 100.
```

**Constraints:
**1 <= prices.size() <= 105
1 <= prices[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-12T09:44:25.517Z  

```java
class Solution {
    public static int maxProfit(int[] prices) {
        // code here
        /* int n = prices.length;
        if (n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        // Left pass
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - minPrice);
        }

        // Right pass
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            right[i] = Math.max(right[i + 1], maxPrice - prices[i]);
        }

        // Combine
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, left[i] + right[i]);
        }

        return maxProfit;
        */
        
        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0; 
        
        for (int price : prices) {
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }
        
        return sell2;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/buy-and-sell-a-share-at-most-twice/1)