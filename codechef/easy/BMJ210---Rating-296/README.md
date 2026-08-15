# BMJ210 - Rating 296

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Total prize money

The code given in the IDE is incorrect - Try and debug this program!!!

In a coding contest, there are prizes for the top rankers. The prize scheme is as follows:

- Top $10$ participants receive rupees $X$ each.
- Participants with rank $11$ to $100$ (both inclusive) receive rupees $Y$ each.

Find the total prize money over all the participants.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each test case contains of a single line of input, two integers $X$ and $Y$ - the prize for top $10$ rankers and the prize for ranks $11$ to $100$ respectively.
### Output Format

For each test case, output the total prize money over all the contestants.

### Sample 1:
Input
Output

```
2
80 1
400 30

```

```
890
6700

```

### Explanation:

 **Test Case $1$:**  Top $10$ participants receive rupees $80$ and next $90$ participants receive rupee $1$ each. So, total prize money $= 10 \cdot 80 + 90 \cdot 1 = 890$.

 **Test Case $2$:**  Top $10$ participants receive rupees $400$ and next $90$ participants receive rupees $30$ each. So, total prize money $= 10 \cdot 400 + 90 \cdot 30 = 6700$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:46:23.789Z  

```java
// The code below is incorrect. Debug this code to solve the problem.
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		int y = read.nextInt();
    		
    		int prize_top10 = 10 * x;
    		
    		int prize_11to100 = 90 * y;
    		System.out.println(prize_top10 + prize_11to100);
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ210)