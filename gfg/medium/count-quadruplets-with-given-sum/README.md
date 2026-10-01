# 4 Sum – Count Quadruplets with Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  and an integer  **target**, you need to find and return the count of quadruplets such that the index of each element of the quadruplet is unique and the sum of the elements is equal to target.

 **Examples:** 

```
Input: arr[] = [1, 5, 3, 1, 2, 10], target = 20
Output: 1
Explanation: Only quadruplet satisfying the condition is arr[1] + arr[2] + arr[4] + arr[5] = 5 + 3 + 2 + 10 = 20. Hence, the answer is 1.

```

```
Input: arr[] = [1, 1, 1, 1, 1], target = 4
Output: 5
Explanation: Three quadruplets with sum 4 are:
arr[0] + arr[1] + arr[2] + arr[3] = 1 + 1 + 1 + 1 = 4
arr[1] + arr[2] + arr[3] + arr[4] = 1 + 1 + 1 + 1 = 4
arr[0] + arr[2] + arr[3] + arr[4] = 1 + 1 + 1 + 1 = 4
arr[0] + arr[1] + arr[3] + arr[4] = 1 + 1 + 1 + 1 = 4
arr[0] + arr[1] + arr[2] + arr[4] = 1 + 1 + 1 + 1 = 4
```

```
Input: arr = [4, 3, -13, 3], target = -3
Output: 1
Explanation: There is only 1 quadruplet with sum = -3, that is [4, 3, -13, 3].
```

**Constraints:
**1 <= arr.length <= 103
-105 <=arr[i]<= 105
-105 <=target<= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T05:20:08.836Z  

```java
class Solution {
    public int countSum(int arr[], int target) {
        // code here
        /*
        int result = 0;
        
        int n = arr.length;
        if (n < 4) return result;

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        if (arr[left] == arr[right]) {
                            int m = right - left + 1;
                            
                            result += m * (m - 1) / 2;
                            break;
                        } else {
                            int countLeft = 1, countRight = 1;
                            
                            while (left + countLeft <= right && arr[left + countLeft] == arr[left]) {
                                countLeft++;
                            }
                            
                            while (right - countRight >= left && arr[right - countRight] == arr[right]) {
                                countRight++;
                            }
                            
                            result += countLeft * countRight;
                            left += countLeft;
                            right -= countRight;
                        }
                    }
                }
            }
        }

        return result;
        */
        
        int n = arr.length;
        Map<Long, Integer> map = new HashMap<>();
        int result = 0;
        
        for (int k = 2; k < n - 1; k++) {
            for(int i = 0; i < k - 1; i++) {
                long sum = (long) arr[i] + arr[k - 1];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            
            for (int l = k + 1; l < n; l++) {
                long secondSum = (long) arr[k] + arr[l];
                long need = (long) target - secondSum;
                
                result += map.getOrDefault(need, 0);
            }
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-quadruplets-with-given-sum/1)