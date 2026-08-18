# CSJ210A - Rating 412

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Football Cup

The code in the IDE is incorrect - debug the code to solve this problem!

Chef likes a football match if

- The match ends in a draw, and,
- At least one goal has been scored by either team.

Given the goals scored by both the teams as $X$ and $Y$ respectively, determine whether Chef will like the match or not.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases. The description of $T$ test cases follows.
- Each test case consists of a single line of input containing two space-separated integers $X$ and $Y$ — the goals scored by each team.
### Output Format

For each test case, output $\texttt{YES}$ if Chef will like the match, else output $\texttt{NO}$.

### Sample 1:
Input
Output

```
2
1 1
0 1

```

```
YES
NO

```

### Explanation:

 **Test case $1$:**  It is a draw in which both teams have scored a goal, Chef will like this match.

 **Test case $2$:**  The game is not a draw. Hence, Chef will not like this match.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T10:29:28.960Z  

```java
// The code below is incorrect. Debug the code to solve this problem
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
    		
    		if(x==y && (x>0 || y>0)){
    		    System.out.println("YES");
    		}
    		else{
    		    System.out.println("NO");
    		}
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ210A)