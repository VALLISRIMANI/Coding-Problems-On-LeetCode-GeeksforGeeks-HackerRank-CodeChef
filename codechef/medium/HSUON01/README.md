# HSUON01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef Finds Next Greater Element

Chef has two lists of integers:

- subsetNumbers: a smaller list of numbers that we are interested in.
- fullNumbers: a larger list that contains all numbers of subsetNumbers, possibly along with other numbers.

For each number in  **subsetNumbers**, Chef wants to find the  **next strictly greater number**  in  **fullNumbers**  that appears  **to the right**  of that number.

- If a greater number exists to the right, return that number.
- If there is no greater number to the right, return $-1$.

Help Chef solve this problem efficiently so he can quickly find the next strictly greater elements for his numbers!

## Function Declaration
- Function Name $findNextGreaterElement$
- Parameters $subsetNumbers$: list of integers $fullNumbers$: list of integers
- Return Value A list of integers containing the next greater element for each number in $subsetNumbers$ or $-1$ if none exists. The output order corresponds to the order of $subsetNumbers$.
## Constraints
- $1 \leq T \leq 100$
- $1 \leq M \leq N \leq 1000$
- $0 \leq subsetNumbers[i], fullNumbers[i] \leq 10^4$
- All integers in $subsetNumbers$ and $fullNumbers$ are unique.
- Every integer in $subsetNumbers$ appears in $fullNumbers$.
### Input Format
- The first line contains a single integer $T$ — the number of test cases.
- For each test case: The first line contains an integer $M$ — the size of $subsetNumbers$. The second line contains $M$ integers representing $subsetNumbers$. The third line contains an integer $N$ — the size of $fullNumbers$. The fourth line contains $N$ distinct integers representing $fullNumbers$.
### Output Format
- For each test case, print $M$ integers in a single line.
- Each integer is the next greater element in $fullNumbers$ for the corresponding number in $subsetNumbers$, or $-1$ if it does not exist.
### Sample 1:
Input
Output

```
1
5
10 3 6 1 9
7
3 10 1 6 9 5 7
```

```
-1 10 9 6 -1
```

### Explanation:
- $10$:Numbers after $10$ in $fullNumbers$ are [1, 6, 9, 5, 7]. None are greater, so the result is $-1$
- $3$: Numbers after $3$ are [10, 1, 6, 9, 5, 7]. The first greater number is $10$
- $6$: Numbers after $6$ are [9, 5, 7]. The first greater number is $9$
- $1$: Numbers after $1$ are [6, 9, 5, 7]. The first greater number is $6$
- $9$: Numbers after $9$ are [5, 7]. None are greater, so the result is $-1$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T15:03:52.337Z  

```java
    public int[] findNextGreaterElement(int[] subsetNumbers, int[] fullNumbers) {
        int n = fullNumbers.length;
        java.util.Map<Integer, Integer> nextGreaterMap = new java.util.HashMap<>();
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        for (int num : fullNumbers) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }
        int[] result = new int[subsetNumbers.length];
        for (int i = 0; i < subsetNumbers.length; i++) {
            result[i] = nextGreaterMap.get(subsetNumbers[i]);
        }
        return result;
    }

```

---

[View on CodeChef](https://www.codechef.com/problems/HSUON01)