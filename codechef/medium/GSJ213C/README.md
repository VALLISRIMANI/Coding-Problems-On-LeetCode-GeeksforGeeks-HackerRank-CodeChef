# GSJ213C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Difference between Run and Submit

Listen

Introducing Listen to Problem✨

Don't want to read? Now you can listen to the problem!

What is the difference between the  **`Run`**  and  **`Submit`**  buttons?

- Run allows you to locally test your code on sample inputs and custom inputs Custom inputs are small inputs - mainly for you to test your code
- Submit sends your code to the online judge to compare your Actual output and the Expected output On submission - your code is checked against thousands of test cases which are included in the hidden or private test files Your code / solution is complete only when you click Submit and get an AC (accepted) verdict Note: Your code can run as expected for your custom inputs - however, it can fail on the private test files. This means your code is NOT solving the problem correctly and needs to be fixed.
### Task

You are given a program which does the following

- Accepts the count of test cases - t - in the 1st line. First line of each test case consists of an integer N
- Outputs the integer which is greater than N by 1
- Click on Run to check the result on custom inputs
- Click on Submit to check the final verdict
### Sample 1:
Input
Output

```
3
5
11
15
```

```
6
12
16
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:38:44.916Z  

```java
// Change the 'custom inputs' below and click 'run'
// Once you have run the code - click on 'submit' to find the result with the private test files

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
            System.out.println(n+1);
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ213C)