# CSJ210A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T10:19:14.510Z  

```java
// Update the '_'s below to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int A = read.nextInt();
    		int B = read.nextInt();
    		
            if( A != B && (A%2 != 0 && B%2 != 0)){
                System.out.println("A and B are different and are odd");
            }
            else if(A != B && (A%2 == 0 && B%2 == 0)){
                System.out.println("A and B are different and are even");
            }
            else{
                System.out.println("Doesn't matter");
            }
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ210A)