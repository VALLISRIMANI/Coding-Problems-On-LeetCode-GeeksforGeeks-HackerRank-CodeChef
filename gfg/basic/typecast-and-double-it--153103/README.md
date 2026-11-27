# Type Cast And Double It

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **num**  representing an integer, typecast it to an integer and return twice its value.

 **Examples:** 

```
Input: num = "5"
Output: 10
Explanation: Typecast "5" to int and then double it 5 * 2 = 10
```

```
Input: num = "12"
Output: 24
Explanation: Typecast "12" to int and then double it 12 * 2 = 24
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:49:44.594Z  

```java
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        
        // code here
        System.out.println(Integer.parseInt(num) * 2);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/typecast-and-double-it--153103/1)