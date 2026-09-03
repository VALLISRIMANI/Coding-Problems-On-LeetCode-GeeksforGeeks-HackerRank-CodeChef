# Meeting Rooms II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays  **start[]** and **end[]**  such that start[i] is the starting time of ith meeting and end[i] is the ending time of ith meeting. Return the  **minimum number**  of rooms required to attend all meetings.

 **Note:**  A person can also attend a meeting if it's starting time is same as the previous meeting's ending time.

 **Examples:** 

```
Input: start[] = [1, 10, 7], end[] = [4, 15, 10]
Output: 1
Explanation: Since all the meetings are held at different times, it is possible to attend all the meetings in a single room.
```

```
Input: start[] = [2, 9, 6], end[] = [4, 12, 10]
Output: 2
Explanation: 1st and 2nd meetings at one room but for 3rd meeting one another room required.

```

 **Constraints:** 
1 ≤ start.size() = end.size() ≤ 105
0 ≤ start[i] < end[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T05:33:10.423Z  

```java
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int n = start.length;
        int[][] meetings = new int[n][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[1] - y[1]);
        
        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }
        Arrays.sort(meetings, (x, y) -> Integer.compare(x[0], y[0]));
        
        for (int i = 0; i < n; i++) {
            int startTime = meetings[i][0];
            int endTime = meetings[i][1];
            
            if (!pq.isEmpty() && pq.peek()[1] <= startTime) {
                pq.poll();
            }
            
            pq.offer(meetings[i]);
        }
        
        return pq.size();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/attend-all-meetings-ii/1)