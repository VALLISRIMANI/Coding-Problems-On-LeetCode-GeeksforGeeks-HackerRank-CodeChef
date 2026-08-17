# BMJ214 - Rating 339

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Max minus Min

Given 3 integers - $A$, $B$ and $C$ - you need to find the difference between the highest and the lowest of the given 3 integers.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of $3$ integers $A, B, C$.
### Output Format

For each test case, output on a new line the difference between the highest and the lowest of the given 3 integers.

### Sample 1:
Input
Output

```
2
1 3 10
5 6 7

```

```
9
2

```

### Explanation:

 **Test case $1$:**  Here, $max(1, 3, 10) = 10$ and $min(1, 3, 10) = 1$. Thus, the difference is $9$.

 **Test case $2$:**  Here, $max(5, 6, 7) = 7$ and $min(5, 6, 7) = 5$. Thus, the difference is $2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:48:46.788Z  

```java
// Try and debug this code to solve the problem!!!
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)  
		{
    		int a = read.nextInt();
    		int b = read.nextInt();
    		int c = read.nextInt();
    		
                //Declare a new variable to store the maximum of the 3 variables.
    		int maximum = Math.max(a, Math.max(b, c));

                //Declare a new variable to store the minimum of the 3 variables.
    		int minimum = Math.min(a, Math.min(b, c));
    		
    		int difference = maximum - minimum;
    		System.out.println(difference);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ214)