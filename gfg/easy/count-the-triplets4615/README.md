# Triplets Where One is Sum of Other Two

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, count the number of  **distinct** triplets (a, b, c) such that:

- a + b = c
- Each triplet is counted only once, regardless of the order of a and b.

 **Examples:** 

```
Input: arr[] = [1, 5, 3, 2]
Output: 2 
Explanation: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
```

```
Input: arr[] = [2, 3, 4]
Output: 0
Explanation: No such triplet exits in the given array.
```

```
Input: arr[] = [1, 2, 1, 1]
Output: 1
Explanation: Since we need to consider only distinct, we have only one triplet (1, 1, 2).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T11:53:15.361Z  

```java
class Solution {
    public int countTriplet(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        int count = 0;
        
        for (int k = n - 1; k >= 2; k--) {
            if (k < n - 1 && arr[k] == arr[k + 1]) {
                continue;
            }
            
            int i = 0;
            int j = k - 1;
            
            while (i < j) {
                int sum = arr[i] + arr[j];
                
                if (sum == arr[k]) {
                    count++;
                    
                    int left = arr[i];
                    int right = arr[j];
                    
                    while (i < j && arr[i] == left) {
                        i++;
                    }
                    
                    while (i < j && arr[j] == right) {
                        j--;
                    }
                } else if (sum < arr[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1)