# BMJ201

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Basic math - Addition and multiplication

Basic math and logic based programming problems are the correct starting point for  **Beginners**.

- In the previous module, we have learnt how to accept multiple inputs and test cases
- The current module will use our knowledge of Java syntax and learnings from the previous module
### Task

Lets start with a simple problem - you need to write a program which does the following

- Accepts the number of inputs / test cases as '$t$' The only line of each test case contains 2 integers - declare them as variables $A$ and $B$
- For each test case, you need to perform the following operations Create a variable - $S$ - the sum of the 2 input integers Create a variable - $P$ - the product of the 2 input integers Output 2 space separated integers - $S$ and $P$ in a single line

 **Note:** 

- The syntax for product of 2 integers in Java is ($X$ * $Y$)
### Sample 1:
Input
Output

```
2
5 10
3 4
```

```
15 50
7 12
```

### Explanation:

 **Test case 1** : The 2 integers are $5$ and $10$ and we output $15$ as their sum and $50$ as their product

 **Test case 2** : The 2 integers are $3$ and $4$ - we output $7$ and $12$ as their sum and product respectively

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:43:55.482Z  

```java
// Update the '_' in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
            // Accept 2 integers inputs
        	int a = read.nextInt();
        	int b = read.nextInt();
        	
        	// Sum of inputs
        	int s = a + b;
        	
        	// Product of inputs
        	int p = a * b;
        	
        	// Print the desired output for each test case
        	System.out.println(s + " " + p);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ201)