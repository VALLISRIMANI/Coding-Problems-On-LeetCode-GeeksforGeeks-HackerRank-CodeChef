# CSJ203A - Rating 245

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T09:48:18.958Z  

```java
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
    		int a = read.nextInt();
    		
    		// Update your code below this line solve the problem
    		System.out.println((a >= x && a < y) ? "YES" : "NO");
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ203A)