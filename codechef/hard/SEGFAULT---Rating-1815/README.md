# SEGFAULT - Rating 1815

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Segmentation Fault

There are $N$ people numbered from $1$ to $N$ such that:

- Exactly one of these people is a thief and always lies;
- All the others are honest and always tell the truth.

If the $i^{th}$ person claims that the thief is  **one**  person out of $L_i, L_i+1, L_i+2, \cdots, R_i$, determine how many people could be the thief.

It is guaranteed that at least one person can be the thief.

### Input Format
- First line will contain $T$, the number of test cases. Then the test cases follow.
- First line of each test case will contain $N$, the number of people. $N$ lines follow.
- The $i^{th}$ line contains two space-separated integers - $L_i$ and $R_i$, the range of people amongst which the $i^{th}$ person claims the thief is.
### Output Format
- For each test case, in the first line, output $K$, the number of possible thieves.
- In the next $K$ lines, output the list of people that could be the thieves, in ascending order.
### Constraints
- $1 \leq T \leq 10^5$
- $3 \leq N \leq 10^5$
- $1 \leq L_i \leq R_i \leq N$
- Sum of $N$ over all test cases does not exceed $10^5$.
- It is guaranteed that at least one person can be the thief.
### Sample 1:
Input
Output

```
1
4
2 2
1 1
1 3
1 3
```

```
2
1
2
```

### Explanation:

 **Test case $1$:**  Two people (numbered $1$ and $2$) can be thief:

- Person $1$ may be the thief because, the other $3$ people claim that he may be the thief, whereas, he lies and claims that person $2$ is the thief.
- Person $2$ may be the thief because, the other $3$ people claim that he may be the thief, whereas, he lies and claims that person $1$ is the thief.
- Person $3$ cannot be the thief because, he claims that the thief lies in the range $[1, 3]$. If he were the thief, then his statement should be false. However, since 3 lies in $[1, 3]$, his statement would be true, which results in a contradiction. Furthermore, the first $2$ people do not claim that he is the thief. Therefore, he cannot be the thief.
- Person $4$ cannot be the thief because the first $3$ people do not claim that he is the thief.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T08:36:35.012Z  

```java
import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] L = new int[n + 1];
            int[] R = new int[n + 1];
            int[] diff = new int[n + 2];

            for (int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                L[i] = Integer.parseInt(st.nextToken());
                R[i] = Integer.parseInt(st.nextToken());

                diff[L[i]]++;
                diff[R[i] + 1]--;
            }

            ArrayList<Integer> ans = new ArrayList<>();

            int count = 0;

            for (int x = 1; x <= n; x++) {
                count += diff[x];

                if (count == n - 1 &&
                    !(L[x] <= x && x <= R[x])) {
                    ans.add(x);
                }
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.println(x);
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SEGFAULT)