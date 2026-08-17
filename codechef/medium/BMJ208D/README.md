# BMJ208D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:41:44.041Z  

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

[View on CodeChef](https://www.codechef.com/problems/BMJ208D)