# TYRES - Rating 809

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Cars and Bikes
### Read problems statements in Russian and Bengali.

Chef opened a company which manufactures cars and bikes. Each car requires $4$ tyres while each bike requires $2$ tyres. Chef has a total of $N$ tyres ($N$ is even). He wants to manufacture maximum number of cars from these tyres and then manufacture bikes from the remaining tyres.

Chef's friend went to Chef to purchase a bike. If Chef's company has manufactured even a single bike then Chef's friend will be able to purchase it.

Determine whether he will be able to purchase the bike or not.

### Input Format
- The first line contains an integer $T$ denoting the number of test cases. The $T$ test cases then follow.
- The first line of each test case contains an integer $N$ denoting the number of tyres.
### Output Format

For each test case, output `YES` or `NO` depending on whether Chef's friend will be able to purchase the bike or not. Output is case insensitive.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 1000$
- $N$ is even
### Sample 1:
Input
Output

```
3
8
2
6

```

```
NO
YES
YES
```

### Explanation:
- For the first test case Chef, will manufacture $2$ cars and will thus use all the $8$ tyres and thus could not manufacture any bike.
- For the second test case, Chef cannot manufacture any car since there are not enough tyres and will thus manufacture only a single bike which will be purchased by Chef's friend.
- For the third test case, Chef will manufacture $1$ car and thus use $4$ tyres. From the remaining $2$ tyres, Chef can manufacture a single bike which will be purchased by Chef's friend.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:07:31.796Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		// Read the number of test cases
		if (scanner.hasNextInt()) {
			int t = scanner.nextInt();
			
			while (t-- > 0) {
				int n = scanner.nextInt();
				
				// If the remainder when divided by 4 is 2, 
				// it means we have enough leftover tyres to make 1 bike.
				if (n % 4 == 2) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		
		scanner.close();
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TYRES)