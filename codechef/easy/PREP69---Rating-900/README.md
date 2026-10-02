# PREP69 - Rating 900

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Remove Duplicates

You are given an array $A_1, A_2, \dots, A_N$ of length $N$ sorted in  **non-decreasing**  order. Your task is to remove all the duplicates and find the sorted  **increasing**  array of distinct elements consisting of all distinct elements present in $A$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first line of each test case contains an integer $N$ - the length of the array $A$.
- The second line of each test case contains $N$ space-separated integers $A_1,A_2,\ldots,A_N$.
### Output Format

For each test case, output two lines:

- The first line should contain a single integer $M$ - the size of the array.
- The second line should contain $M$ space-separated integers denoting the elements of the array.
### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ over all test cases won't exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
3
2
5 10
4
1 5 5 10
5
4 4 6 6 8

```

```
2
5 10 
3
1 5 10 
3
4 6 8 

```

### Explanation:

 **Test case $1$** : Distinct elements will be $5$, $10$. So the array will be $[5, 10]$.

 **Test case $2$** : Distinct elements will be $1$, $5$, $10$. So the array will be $[1, 5, 10]$.

 **Test case $3$** : Distinct elements will be $4$, $6$, $8$. So the array will be $[4, 6, 8]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T14:38:17.121Z  

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            ArrayList<Integer> distinctElements = new ArrayList<>();
            int prev = -1;
            
            for (int i = 0; i < N; i++) {
                int current = Integer.parseInt(st.nextToken());
                if (current != prev) {
                    distinctElements.add(current);
                    prev = current;
                }
            }
            
            System.out.println(distinctElements.size());
            for (int i = 0; i < distinctElements.size(); i++) {
                System.out.print(distinctElements.get(i));
                if (i < distinctElements.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PREP69)