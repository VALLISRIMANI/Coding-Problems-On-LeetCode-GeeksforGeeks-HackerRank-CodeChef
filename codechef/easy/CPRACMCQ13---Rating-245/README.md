# CPRACMCQ13 - Rating 245

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Age Limit

Chef wants to appear in a competitive exam. To take the exam, there are following requirements:

- Minimum age limit is $X$ (i.e. Age should be greater than or equal to $X$).
- Age should be strictly less than $Y$.

Chef's current Age is $A$. Find whether he is currently eligible to take the exam or not.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each test case consists of a single line of input, containing three integers $X, Y,$ and $A$ as mentioned in the statement.
### Output Format

For each test case, output `YES` if Chef is eligible to give the exam, `NO` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints
- $1 \leq T \leq 1000$
- $20 \leq X \lt Y \leq 40$
- $10 \leq A \leq 50$
### Sample 1:
Input
Output

```
5
21 34 30
25 31 31
22 29 25
20 40 15
28 29 28

```

```
YES
NO
YES
NO
YES

```

### Explanation:

 **Test case $1$:**  The age of Chef is $30$. His age satisfies the minimum age limit as $30 \ge 21$. Also, it is less than the upper limit as $30 \lt 34$. Thus, Chef is eligible to take the exam.

 **Test case $2$:**  The age of Chef is $31$. His age satisfies the minimum age limit as $31 \ge 25$. But, it is not less than the upper limit as $31 \nless 31$. Thus, Chef is not eligible to take the exam.

 **Test case $3$:**  The age of Chef is $25$. His age satisfies the minimum age limit as $25 \ge 22$. Also, it is less than the upper limit as $25 \lt 29$. Thus, Chef is eligible to take the exam.

 **Test case $4$:**  The age of Chef is $15$. His age does not satisfy the minimum age limit as $15 \lt 20$. Thus, Chef is not eligible to take the exam.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:18:09.055Z  

```c_cpp
#include <stdio.h>

int main() {
    int t;

    // Input for the number of test cases using scanf
    scanf("%d", &t);

    // Loop for each test case
    while (t--) {
        int x, y, a;
        scanf("%d %d %d", &x, &y, &a);

        // Check eligibility: age must be >= X and < Y
        if (a >= x && a < y) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CPRACMCQ13)