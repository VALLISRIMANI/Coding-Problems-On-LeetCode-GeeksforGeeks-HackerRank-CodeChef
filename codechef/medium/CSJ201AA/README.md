# CSJ201AA

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Comparison operators

Usual  **Comparison operators**  used within conditional statements are

- Equals: a == b
- Not Equals: a != b
- Less than: a < b
- Less than or equal to: a <= b
- Greater than: a > b
- Greater than or equal to: a >= b
### Task

Write a program which does the following

- Accepts the count of test cases - $t$ Each test case has one integer $N$
- Output the following for each test case on separate lines If input is exactly divisible by $3$, output 'Divisible by 3'. Else output 'Not divisible by 3'. If the input is odd, output 'Odd'. Else output 'Even'.
### Sample 1:
Input
Output

```
4
3
4
5
6
```

```
Divisible by 3
Odd
Not divisible by 3
Even
Not divisible by 3
Odd
Divisible by 3
Even
```

### Explanation:

 **Test case 1:**  $3$ is divisible by 3 and is odd as well
 **Test case 2:**  $4$ is not divisible by 3. However, $4$ is even.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T09:31:18.433Z  

```java
// Update the '_' below to solve the problem

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
    		
    		// Condition 1
            if(n%3 == 0){
                System.out.println("Divisible by 3");
            }
            else{
                System.out.println("Not divisible by 3");
            }
            
            // Condition 2
            if(n%2 != 0){
                System.out.println("Odd");
            }
            else{
                System.out.println("Even");
            }
    		
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ201AA)