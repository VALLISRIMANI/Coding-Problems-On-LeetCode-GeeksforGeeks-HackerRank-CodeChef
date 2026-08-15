# GSJ214

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### String mirror - Double strings

Listen

Write a program in the `IDE` which does the following

- Accepts the count of test cases - t - in the 1st line First line of each test case consists of a string S
- You need to perform the following operation Create a variable X which contains the string S concatenated with the string S Output X for each test case
### Sample 1:
Input
Output

```
3
ab
bc
cd
```

```
abab
bcbc
cdcd
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:41:35.777Z  

```java
// Update the '_' in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        
        // accept the count of test cases given in the 1st line
        int t = read.nextInt();
        for(int i=0; i < t; i++)
        {
            String s = read.next();
            // create a variable X which stores the value of string S concatenated with itself
            String x = s + s;
            // output the variable X
            System.out.println(x);
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ214)