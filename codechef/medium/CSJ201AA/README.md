# CSJ201AA

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T09:30:36.938Z  

```java
// Update the blanks in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
            // Accept one integer as input
    		int n = read.nextInt();
    		
    		// 1st condition in the problem
    		if(n <= 100){
    		    System.out.println("Good");
    		}
    		
    		// 2nd condition in the problem
    		else if(n > 100 && n <= 200){
    		    System.out.println("Better");
    		}
    		
    		// 3rd condition in the problem
    		else{
    		    System.out.println("Best");
    		}
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ201AA)