# Seating Arrangement

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **k**  representing the number of people to be seated and an array  **seats[]**, where  **0**  denotes an empty seat and  **1**  denotes an occupied seat.

Determine whether it is possible to seat all  **k**  people such that no two occupied seats are adjacent (including newly seated people).

 **Examples:** 

```
Input: k = 2, seats[] = [0, 0, 1, 0, 0, 0, 1]
Output: true
Explanation: The two people can sit at index 0 and 4.

```

```
Input: k = 1, seats[] = [0, 1, 0]
Output: false
Explanation: There is no way to get a seat for one person.

```

```
Input: k = 0, seats[] = [0, 0, 0, 1, 1]
Output: false
Explanation: The seating arrangement already contains two adjacent occupied seats at indices 3 and 4.
```

**Constraints:
**0 ≤ k ≤ 105
1 ≤ seats.size() ≤ 105
seats[i] == 0 or seats[i] == 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T15:30:56.460Z  

```java
class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        // code here
        int n = seats.length;

        for (int i = 1; i < n; i++) {
            if (seats[i] == 1 && seats[i - 1] == 1) {
                return false;
            }
        }

        for (int i = 0; i < n && k > 0; i++) {
            if (seats[i] == 0) {
                boolean leftEmpty = (i == 0 || seats[i - 1] == 0);
                boolean rightEmpty = (i == n - 1 || seats[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    seats[i] = 1;
                    k--;
                }
            }
        }

        return k <= 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/seating-arrangement--170647/1)