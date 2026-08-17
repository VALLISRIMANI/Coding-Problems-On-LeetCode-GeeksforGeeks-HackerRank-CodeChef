# BMJ211 - Rating 306

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Credits

The code given in the IDE is incorrect - Try and debug this program!!!

In the current semester, you have taken $X$ RTP courses, $Y$ Audit courses and $Z$ Non-RTP courses.
The credit distribution for the courses are:

- $4$ credits for clearing each RTP course, $2$ credits for clearing each Audit course, $0$ credits for clearing a Non-RTP course.

Assuming that you cleared all your courses, report the number of credits you obtain this semester.

- Input format The first line of input will contain an integer $T$ — the number of test cases. The first and only line of each test case contains three integers $X$, $Y$ and $Z$
- Output format For each test case, output on a new line the number of credits you obtain this semester.
### Sample 1:
Input
Output

```
2
6 6 5
8 7 2
```

```
36
46

```

### Explanation:

 **Test case $1$:**  You obtain $4$ credits for each of the RTP courses, accounting for $4 \cdot 6 = 24$ credits. You also obtain $2$ credits for each audit course, accounting for $2 \cdot 6 = 12$ credits. Finally, you get $0$ credits for each of the non-RTP courses, accounting for $0 \cdot 5 = 0$ credits. This accounts for a total of $24 + 12 + 0 = 36$ credits.

 **Test case $2$:**  You obtain $4$ credits for each of the RTP courses, accounting for $4 \cdot 8 = 32$ credits. You also obtain $2$ credits for each audit course, accounting for $2 \cdot 7 = 14$ credits. Finally, you get $0$ credits for each of the non-RTP courses, accounting for $0 \cdot 2 = 0$ credits. This accounts for a total of $32 + 14 + 0 = 46$ credits.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:48:07.191Z  

```java
// Try and debug this code to solve the problem!!!
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

    		int total_Credits = 4*x + 2*y + 0*z;
    		
    		System.out.println(total_Credits);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BMJ211)