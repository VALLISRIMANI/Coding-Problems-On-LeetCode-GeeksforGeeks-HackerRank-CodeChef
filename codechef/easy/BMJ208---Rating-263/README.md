# BMJ208 - Rating 263

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Burgers

Chef has $A$ patties and $B$ buns.
To make $1$ burger, Chef needs $1$ patty and $1$ bun.
Find the  **maximum**  number of burgers that Chef can make.

### Input Format
- The first line of input will contain an integer $T$ — the number of test cases.
- The first and only line of each test case contains two space-separated integers $A$ and $B$, the number of patties and buns respectively.
### Output Format

For each test case, output the maximum number of burgers that Chef can make.

### Sample 1:
Input
Output

```
3
2 2
2 3
23 17
```

```
2
2
17

```

### Explanation:

 **Test case $1$:**  Chef has $2$ patties and $2$ buns, and therefore Chef can make $2$ burgers.

 **Test case $2$:**  Chef has $2$ patties and $3$ buns. Chef can make at most $2$ burgers by using $2$ patties and $2$ buns.

 **Test case $3$:**  Chef has $23$ patties and $17$ buns. Chef can make at most $17$ burgers by using $17$ patties and $17$ buns.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:45:31.654Z  

```java
// Update the '_' in the code below to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		// Always first check if the problem has test cases
		int t = read.nextInt();
		// loop through each test case for its inputs
		for(int i=0; i<t; i++)
		{
		    // Accept 2 integers inputs.
    		int a = read.nextInt();
    		int b = read.nextInt();
    		
    		// Declare a new variable to store the count of burgers
    		int burgers = Math.min(a, b); 
    		
    		// print the desired output for each test case
    		System.out.println(burgers);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ208)