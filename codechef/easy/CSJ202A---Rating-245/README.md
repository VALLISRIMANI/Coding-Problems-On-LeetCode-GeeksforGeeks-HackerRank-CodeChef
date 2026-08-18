# CSJ202A - Rating 245

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Age Limit

Best way to learn - practice and solve problems based on the concept!!!

### Task

Chef wants to appear in a competitive exam. To take the exam, there are following requirements:

- Minimum age limit is $X$ (i.e. Age should be greater than or equal to $X$).
- Age should be strictly less than $Y$.

Chef's current Age is $A$. Find whether he is currently eligible to take the exam or not.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each test case consists of a single line of input, containing three integers $X, Y,$ and $A$ as mentioned in the statement.
### Output Format
- For each test case, output YES if Chef is eligible to give the exam, NO otherwise.
### Sample 1:
Input
Output

```
2
21 34 30
25 31 31

```

```
YES
NO

```

### Explanation:

 **Test case $1$:**  The age of Chef is $30$. His age satisfies the minimum age limit as $30 \ge 21$. Also, it is less than the upper limit as $30 \lt 34$. Thus, Chef is eligible to take the exam.

 **Test case $2$:**  The age of Chef is $31$. His age satisfies the minimum age limit as $31 \ge 25$. But, it is not less than the upper limit as $31 \nless 31$. Thus, Chef is not eligible to take the exam.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T09:47:52.317Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		int y = read.nextInt();
    		int a = read.nextInt();
    		
    		// Update your code below this line solve the problem
    		System.out.println((a >= x && a < y) ? "YES" : "NO");
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ202A)