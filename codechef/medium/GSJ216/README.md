# GSJ216

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debug this code - Why is this code incorrect

Listen

Now try and debug this problem.

You are given a program in the `IDE` which is trying to do the following

- Accepts the count of test cases - t - in the 1st line Each line of test case consists of an integer N
- For each test case, it is supposed to print double the integer N as the output
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
**Submitted:** 2026-08-15T16:43:18.776Z  

```java
// Debug the code below to solve the problem
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

[View on CodeChef](https://www.codechef.com/problems/GSJ216)