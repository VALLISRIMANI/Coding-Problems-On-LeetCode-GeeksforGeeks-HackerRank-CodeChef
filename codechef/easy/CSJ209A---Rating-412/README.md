# CSJ209A - Rating 412

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T10:29:41.510Z  

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

[View on CodeChef](https://www.codechef.com/problems/CSJ209A)