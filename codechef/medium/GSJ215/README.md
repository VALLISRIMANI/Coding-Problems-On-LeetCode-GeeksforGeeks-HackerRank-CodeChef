# GSJ215

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debug this code - Why is this code incorrect

Listen

So as you solve programming problems - you will need to debug and find errors in your own code.

### Task

You are given a program which does the following

- Accepts the count of test cases - t - in the 1st line The only line of each test case consists of an integer N
- For each test case, output to the console the value that is double the integer N

Can you try and  **debug / fix**  the error in the given program?

### Sample 1:
Input
Output

```
3
1
2
3
```

```
2
4
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:42:37.009Z  

```java
// Debug the following code to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int n = read.nextInt();
            System.out.println(n*2);
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ215)