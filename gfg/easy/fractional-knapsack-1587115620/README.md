# Fractional Knapsack

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays,  **val[]** and  **wt[]** , representing the values and weights of items, and an integer capacity representing the maximum weight a knapsack can hold, determine the maximum total value that can be achieved by putting items in the knapsack. You are allowed to break items into fractions if necessary.
Return the maximum value as a double, rounded to 6 decimal places.

 **Examples :** 

```
Input: val[] = [60, 100, 120], wt[] = [10, 20, 30], capacity = 50
Output: 240.000000
Explanation: By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg. Hence total price will be 60+100+(2/3)(120) = 240

```

```
Input: val[] = [500], wt[] = [30], capacity = 10
Output: 166.670000
Explanation: Since the item’s weight exceeds capacity, we take a fraction 10/30 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T06:14:35.456Z  

```java
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        
        int[][] items = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
        }
        
        Arrays.sort(items, (a, b) -> 
            Double.compare(
                    (double) b[0] / b [1], 
                    (double) a[0] / a[1]
            )
        );
        
        double total = 0.0;
        
        for (int i = 0; i < n; i++) {
            if (capacity >= items[i][1]) {
                total += items[i][0];
                capacity -= items[i][1];
            } else {
                total += (double) items[i][0] / items[i][1] * capacity;
                break;
            }
        }
        
        return total;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1)