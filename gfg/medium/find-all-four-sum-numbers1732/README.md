# 4 Sum - All Quadruples

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of integers and another integer  **target**. You have to find all  **unique** quadruples from the given array whose  **sum** is equal to the given  **target**.

 **Note:**  All the quadruples should be internally sorted, i.e for any quadruple [q1, q2, q3, q4] it should be : q1 ≤ q2 ≤ q3 ≤ q4.

 **Examples :** 

```
Input: arr[] = [0, 0, 2, 1, 1], target = 3
Output: [[0, 0, 1, 2]]
Explanation: Sum of 0, 0, 1, 2 is equal to 3.

```

```
Input: arr[] = [10, 2, 3, 4, 5, 7, 8], target = 23
Output: [[2, 3, 8, 10], [2, 4, 7, 10], [3, 5, 7, 8]] 
Explanation: Sum of [2, 3, 8, 10] is 23, sum of [2, 4, 7, 10] is 23 and sum of [3, 5, 7, 8] is also 23.
```

```
Input: arr[] = [0, 0, 2, 1, 1], target = 2
Output: [[0, 0, 1, 1]]
Explanation: Sum of [0, 0, 1, 1] is equal to 2.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 200
-106 ≤ target ≤ 106
-106 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T07:18:39.416Z  

```java
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;
        if (n < 4) return result;

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[left], arr[right])));
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) left++;
                        while (left < right && arr[right] == arr[right + 1]) right--;
                    }
                }
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1)