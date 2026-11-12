# LEARNJSP132 - Rating 746

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Coding problem-2

Listen

Given $n$ ($n$ is  **even**), determine the number of  **black cells**  in an $n \times n$ chessboard.
Update the function given in the IDE to solve the problem.

### Input Format

The only line of the input contains a single integer $n$.

### Output Format

Output the number of black cells in an $n \times n$ chessboard.

### Constraints
- $2 \leq n \leq 100$
- $n$ is even
### Sample 1:
Input
Output

```
8
```

```
32
```

### Explanation:

There are $32$ black cells and $32$ white cells in an $8 \times 8$ chessboard. So the answer is $32$.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T13:37:05.847Z  

```js
// Complete the following two functions to get the desired result

function square(x){
   return x * x;
}
    
function half(x){
   return x / 2;
}

function solve(n){
    result1 = square(n);
    result2 = half(result1);
    console.log(result2);
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP132)