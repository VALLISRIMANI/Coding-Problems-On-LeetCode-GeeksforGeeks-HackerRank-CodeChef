# LEARNJSP133 - Rating 347

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Coding problem-4

Listen

Chef is taking his baby steps into the world of programming.

The very first program he's tasked to write is as follows:
"Given two integers $A$ and $B$, print $A+B$."

Unfortunately, Chef makes a typo: his program outputs $A\times B$ instead of $A+B$.

Given the values of $A$ and $B$, can you help Chef find the  *absolute difference*  between the correct answer and the value his program prints?

#### Debug the code in the IDE to solve the problem.
### Input Format

The only line of input will contain two space-separated integers, $A$ and $B$.

### Output Format

Print a single integer: the difference between the correct answer and Chef's output.

### Constraints

$1 \leq A, B \leq 10$

### Sample 1:
Input
Output

```
4 7
```

```
17
```

### Explanation:

The correct answer is $4+7 = 11$, but Chef's program prints $4\times 7 = 28$.
The difference between them is $|28 - 11| = 17$.

### Sample 2:
Input
Output

```
1 6
```

```
1
```

### Explanation:

The correct answer is $1+6 = 7$, but Chef's program prints $1\times 6 = 6$.
The difference between these values is $1$.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T13:38:32.882Z  

```js
// Debug the code below to solve the problem

function multiply(a, b) {
    return (a * b);
}

function sum(x, y) {
    return (x + y);
}
    
function absDiff(a, b) {
    return Math.abs(a - b); // Math.abs() is inbuilt JS method
}

function solve(A, B){
    const muliplication = multiply(A, B);
    const summation = sum(A, B);
    const result = absDiff(muliplication, summation);
    console.log(result);
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP133)