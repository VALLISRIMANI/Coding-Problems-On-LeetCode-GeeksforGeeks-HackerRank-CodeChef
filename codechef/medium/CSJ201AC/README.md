# CSJ201AC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Logical operators

Let us try an example with multiple conditions which can be clubbed into a single  **if / else**  condition using " **&&** " and " **||** ".

### Task

You are given 2 integers $A$ and $B$.
You need to compute and output the following for each test case

- If $A$ is not equal to $B$ and $A$ and $B$ are both odd - then output 'A and B are different and are odd'
- Else if $A$ is not equal to $B$ and $A$ and $B$ are both even - then output 'A and B are different and are even'
- For every other value of $A$ and $B$, output 'Doesn't matter'

Solve this problem in the IDE.

### Sample 1:
Input
Output

```
4
-9 5
3 3
-10 10
2 1
```

```
A and B are different and are odd
Doesn't matter
A and B are different and are even
Doesn't matter
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T10:19:13.118Z  

```java
// Update the '_'s below to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int A = read.nextInt();
    		int B = read.nextInt();
    		
            if( A != B && (A%2 != 0 && B%2 != 0)){
                System.out.println("A and B are different and are odd");
            }
            else if(A != B && (A%2 == 0 && B%2 == 0)){
                System.out.println("A and B are different and are even");
            }
            else{
                System.out.println("Doesn't matter");
            }
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ201AC)