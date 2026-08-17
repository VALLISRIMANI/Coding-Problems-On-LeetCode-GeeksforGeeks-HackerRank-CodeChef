# BMJ208C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Modulo function

The modulo - $\%$ function is helpful whenever we want to check the divisibility of 2 numbers.

### Task

There are multiple test cases denoted by the integer $T$.
You are given 2 integers - $A$ and $B$.
For each test case, you need to output the following 2 space separated integers  **on a single line** 

- The quotient when $A$ is divided by $B$ - i.e. $A / B$
- The remainder when $A$ is divided by $B$ - i.e. $A \% B$

Go ahead and code out the solution in the IDE.

### Sample 1:
Input
Output

```
4
10 5
11 5
14 5
15 5
```

```
2 0
2 1
2 4
3 0
```

### Explanation:

$%$ function gives us the output $0$ only when $A$ is divisible by $B$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:41:43.031Z  

```java
// Update the blanks in the code below to solve the problem
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

    		System.out.print(a / b + " ");
            System.out.println(a % b);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ208C)