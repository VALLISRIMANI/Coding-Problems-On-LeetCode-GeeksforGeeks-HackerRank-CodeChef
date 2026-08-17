# BMJ208A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Some useful math functions

In this module - you will solve some practice problems yourself!

Below are some simple math formulae that you will find useful

- $Math.min(A, B)$ - Returns the smallest among $2$ integers $A$, $B$
- $Math.max(A, B)$ - Returns the largest among $2$ integers $A$, $B$
- $Math.abs(A - B)$ - Necessarily returns the absolute value of $(A - B)$
- $A$ % $B$ - Returns the remainder when $A$ is divided by $B$

Proceed to the IDE to test out the syntax.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:39:47.745Z  

```java
// Click on 'Submit' to check the output of the functions
// Click on 'Next' to proceed

class Codechef
{
	public static void main (String[] args)
	{
		int a = 45;
		int b = 36;
    	
    	// Output the minimum value of 'a' and 'b'
		System.out.println(Math.min(a, b));
		
		// Output the maximum value of 'a' and 'b'
		System.out.println(Math.max(a, b));
		
		// Output the absolute value of the difference of 'b' and 'a'
		System.out.println(Math.abs(b - a));
		
		int c = 6;
        int d = 8;
        
        // Output the remainder when 'b' is divided by 'c' and 'd'
        System.out.println(b % c);
        System.out.println(b % d);
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ208A)