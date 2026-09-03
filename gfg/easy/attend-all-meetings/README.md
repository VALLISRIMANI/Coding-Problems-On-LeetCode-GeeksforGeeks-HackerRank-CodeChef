# Meeting Rooms

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D array  **arr[][],**  where  **arr[i][0]** is the  **starting time** of ith meeting and  **arr[i][1]** is the  **ending time** of ith meeting, the task is to check if it is possible for a person to attend all the meetings such that he can attend only one meeting at a particular time.

 **Note:**  A person can attend a meeting if its starting time is greater than or equal to the previous meeting's ending time.

 **Examples:** 

```
Input: arr[][] = [[1, 4], [10, 15], [7, 10]]
Output: true
Explanation: Since all the meetings are held at different times, it is possible to attend all the meetings.
```

```
Input: arr[][] = [[2, 4], [9, 12], [6, 10]]
Output: false
Explanation: Since the second and third meeting overlap, a person cannot attend all the meetings.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2*106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T05:15:20.771Z  

```java
class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        /*
        int n = arr.length;
        Arrays.sort(arr, (x, y) -> x[1] - y[1]);

        int result = 1, j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i][0] >= arr[j][1]) {
                result++;
                j = i;
            }
        }

        return result == n;
        */
        
        int n = arr.length;
        Arrays.sort(arr, (x, y) -> x[1] - y[1]);
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i][1] > arr[i + 1][0]) {
                return false;
            }
        }
        
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/attend-all-meetings/1)