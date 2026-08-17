# BMJ208B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Abs() - Absolute function

Let us check the $abs$ function in a bit more detail

### Task

There are multiple test cases denoted by the integer $T$.
You are given 2 integers - $A$ and $B$.
For each test case, you need to output the following 4 space separated integers  **on a single line** 

- $A - B$
- $B - A$
- $Math.abs(A - B)$
- $Math.abs(B - A)$

What do you observe in the results?
Go ahead and code out the solution in the IDE.

### Sample 1:
Input
Output

```
3
10 5
5 10
3 11
```

```
5 -5 5 5
-5 5 5 5
-8 8 8 8
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:41:03.225Z  

```java
// Update the '_' in the code below to solve this problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		// loop through each test case for its inputs
		for(int i=0; i<t; i++)
		{
		    // Accept 2 integers inputs.
    		int a = read.nextInt();
    		int b = read.nextInt();

    		System.out.print((a - b) + " ");
            System.out.print((b - a) + " ");
            System.out.print((Math.abs(a - b)) + " ");
            System.out.println(Math.abs(b - a));
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ208B)