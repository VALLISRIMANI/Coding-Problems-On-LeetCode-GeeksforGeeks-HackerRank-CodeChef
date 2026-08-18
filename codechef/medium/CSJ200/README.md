# CSJ200

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Module on basic conditional statements

We have reviewed programming problems on basic math in the previous module.
We now incorporate conditional statements in our problem solving capabilities along with basic math.

Just a recap on what we covered in Learn Java learning path regarding conditional statements.

- "if" and "else" can be used together to create conditions.
- Java relies on curly braces to define scope in the code.
- The "else if" keyword means "if the previous conditions were not true, then try this condition"
- The "else" keyword includes all cases which aren't included in the previous conditions.
- Usual conditions used within if / else / else if statements Equals: a == b Not Equals: a != b Less than: a < b Less than or equal to: a <= b Greater than: a > b Greater than or equal to: a >= b
- "and" and "or" statements help check multiple conditions

Revise some of this syntax in the IDE.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T09:29:37.577Z  

```java
// Click on 'Submit' to first see the results
// Click on 'Next to continue'
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int a = 13;
		int b = 15;
		
		if(a>=b){
		    System.out.println(a + " is greater than or equal to " + b);
		}
		else{
		    System.out.println(a + " is lesser than " + b);
		}
		
		// lets add the else if statement
		// notice we can't declare 'a' and 'b' again, since we already did, we just need to change the values.
		a = 14;
		b = 14;
		
		if(a>b){
		    System.out.println(a + " is greater tha b " + b);
		}
		else if(a == b){
		    System.out.println(a + " is equal to " + b);
		}
		else{
		    System.out.println(a + " is lesser than " + b);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CSJ200)