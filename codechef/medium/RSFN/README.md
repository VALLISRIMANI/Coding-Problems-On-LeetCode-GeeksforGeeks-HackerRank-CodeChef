# RSFN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fibonacci Numbers Range Sum

You are given an array $I$ of $N$ positive integers.

For each position $i$, replace $I_i$ conceptually with the $I_i$-th Fibonacci number. The Fibonacci sequence is defined as $F_1=1$, $F_2=1$, and $F_i=F_{i-1}+F_{i-2}$ for $i\ge3$.

You are then given $Q$ queries. Each query specifies a range $[L,R]$ and asks for the sum of the Fibonacci values corresponding to all array elements from position $L$ to $R$, inclusive.

For each query $[L,R]$, find:

$F_{I_L}+F_{I_{L+1}}+\cdots+F_{I_R}$

Since the sum can be large, print the answer modulo $10^9+7$.

### Input Format

The first line contains two space-separated integers $N$ and $Q$ — the size of the array and the number of queries.

The second line contains $N$ space-separated integers $I_1,I_2,\ldots,I_N$.

Each of the next $Q$ lines contains two space-separated integers $L$ and $R$, representing a  **1-based inclusive range**.

### Output Format

For each query, print the required Fibonacci sum modulo $10^9+7$ on a separate line.

### Constraints
- $1 \le N,Q \le 10^5$
- $1 \le I_i \le 10^5$
- $1 \le L \le R \le N$
### Sample 1:
Input
Output

```
5 2
1 2 3 4 5
2 4
1 5
```

```
6
12
```

### Explanation:

The Fibonacci values corresponding to the array are:

`1 1 2 3 5`

For the first query, the required sum is:

$1+2+3=6$

For the second query, the required sum is:

$1+1+2+3+5=12$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:43:58.443Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] I = new int[N];
        int maxI = 2;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            I[i] = Integer.parseInt(st.nextToken());
            if (I[i] > maxI) maxI = I[i];
        }

        // 1. Precompute Fibonacci numbers
        int[] F = new int[maxI + 1];
        F[1] = 1;
        if (maxI >= 2) F[2] = 1;
        for (int i = 3; i <= maxI; i++) {
            int val = F[i - 1] + F[i - 2];
            if (val >= MOD) val -= MOD;
            F[i] = val;
        }

        // 2. Build Prefix Sums
        int[] P = new int[N + 1];
        for (int i = 0; i < N; i++) {
            int val = P[i] + F[I[i]];
            if (val >= MOD) val -= MOD;
            P[i + 1] = val;
        }

        // 3. Answer queries
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int ans = P[R] - P[L - 1];
            if (ans < 0) ans += MOD;
            sb.append(ans).append("\n");
        }

        System.out.print(sb.toString());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RSFN)