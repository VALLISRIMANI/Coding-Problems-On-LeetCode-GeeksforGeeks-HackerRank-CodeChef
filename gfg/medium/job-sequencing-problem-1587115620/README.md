# Job Sequencing Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two arrays:  **deadline[]**, and **profit[]**, which represent a set of jobs, where each job is associated with a deadline, and a profit. Each job takes 1 unit of time to complete, and only one job can be scheduled at a time. You will earn the profit associated with a job only if it is completed by its deadline.

Your task is to return the following two values

- Number of jobs selected for the maximum profit. 
- The total maximum profit by completing those jobs.

 **Examples :** 

```
Input: deadline[] = [4, 1, 1, 1], profit[] = [20, 10, 40, 30]
Output: [2, 60]
Explanation: Job1 and Job3 can be done with maximum profit of 60 (20 + 40).

```

```
Input: deadline[] = [2, 1, 2, 1, 1], profit[] = [100, 19, 27, 25, 15]
Output: [2, 127]
Explanation: Job1 and Job3 can be done with maximum profit of 127 (100 + 27).
```

```
Input: deadline[] = [3, 1, 2, 2], profit[] = [50, 10, 20, 30]
Output: [3, 100]
Explanation: Job1, Job3 and Job4 can be completed with a maximum profit of 100 (50 + 20 + 30).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T07:16:37.445Z  

```java
/* class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;
        int[][] jobs = new int[n][2];
        
        int maxDeadline = -1;
        
        for (int i = 0; i < n; i++) {
            jobs[i][0] = profit[i];
            jobs[i][1] = deadline[i];
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }
        
        Arrays.sort(jobs, (a, b) -> b[0] - a[0]);
        
        int jobsSelected = 0;
        int totalProfit = 0;
        boolean[] slot = new boolean[maxDeadline + 1];
        
        for (int[] job : jobs) {
            for (int i = job[1]; i >= 1; i--) {
                
                if (!slot[i]) {
                    slot[i] = true;
                    
                    jobsSelected++;
                    totalProfit += job[0];
                    
                    break;
                }
            }
        }
        
        return new ArrayList<>(Arrays.asList(jobsSelected, totalProfit));
    }
}
*/

class Solution {

    int[] parent;

    int find(int x) {
        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        int[][] jobs = new int[n][2];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = profit[i];
            jobs[i][1] = deadline[i];
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        Arrays.sort(jobs, (a, b) -> b[0] - a[0]);

        parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int jobsDone = 0;
        int totalProfit = 0;

        for (int[] job : jobs) {

            int availableSlot = find(job[1]);

            if (availableSlot > 0) {

                jobsDone++;
                totalProfit += job[0];

                parent[availableSlot] = find(availableSlot - 1);
            }
        }

        return new ArrayList<>(Arrays.asList(jobsDone, totalProfit));
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1)