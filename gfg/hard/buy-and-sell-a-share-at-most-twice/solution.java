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