# BMJ217 - Rating 358

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Population

The code given in the IDE is incorrect - Try and debug this program!!!

 **Problem statement** 
There were initially $X$ million people in a town, out of which $Y$ million people left the town and $Z$ million people immigrated to this town.
Determine the final population of the town in millions.

- Input format The first line of input will contain an integer $T$ — the number of test cases. The first and only line of each test case contains three integers $X$, $Y$ and $Z$.
- Output format For each test case, output on a new line the final population of the town
### Sample 1:
Input
Output

```
2
3 1 2
2 2 2

```

```
4
2

```

### Explanation:

 **Test case $1$:**  The initial population of the town was $3$ million, out of which $1$ million people left and $2$ million people entered the town. So, final population $= 3 - 1 + 2 = 4$ million.

 **Test case $2$:**  The initial population of the town was $2$ million, out of which $2$ million left and $2$ million immigrated. The final population is thus $2+2-2 = 2$ million.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:50:51.272Z  

```java
// The code below is incorrect. Debug this code to solve the problem
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
    		int z = read.nextInt();
    		
    		// y people move out of the town
    		int total_population = x - y;
    		
    		total_population = total_population + z;
    		System.out.println(total_population);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ217)