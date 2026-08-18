# CSJ201AB

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Logical operators & conditional statements

We reviewed basic conditional operators in the previous module.
In this module - we will cover logical operators in conditional statements.

- AND "&&" and OR "||" statements help check multiple conditions
- A single statement can have multiple conditions clubbed together using "&&" and "||". These can be used in if / else conditions.
### Task

You are given 3 integers $N$, $A$ and $B$.
You need to compute and output the following for each test case

- If $N$ is divisible by both $A$ and $B$ - then output 'N is divisible by A and B'
- Else if $N$ is divisible by $A$ and not $B$ - then output 'N is divisible by only A'
- Else if $N$ is divisible by $B$ and not $A$ - then output 'N is divisible by only B'
- Else if $N$ is divisible by neither $A$ nor $B$ - then output 'N is divisible by neither A nor B'

Solve this problem in the IDE.

### Sample 1:
Input
Output

```
4
10 5 2
10 3 2
12 3 5
10 4 3
```

```
N is divisible by A and B
N is divisible by only B
N is divisible by only A
N is divisible by neither A nor B
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T10:18:03.596Z  

```java
// Update the '_' in the code below to solve the problem

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int N = read.nextInt();
    		int A = read.nextInt();
    		int B = read.nextInt();
    		
            if(N % A == 0 && N % B == 0){
                System.out.println("N is divisible by A and B");
            }
            else if(N%A == 0){
                System.out.println("N is divisible by only A");
            }
            else if(N%B == 0){
                System.out.println("N is divisible by only B");
            }
            
            // The last statement could have been an 'else' statement
            // elif condition used to show usage of 'and' statement
    		else if(N%A != 0 && N%B != 0){
    		    System.out.println("N is divisible by neither A nor B");
    		}
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ201AB)