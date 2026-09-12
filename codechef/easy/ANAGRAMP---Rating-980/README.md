# ANAGRAMP - Rating 980

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Check if a string is anagram of another

Given two strings, your task is to check if they are anagrams of each other. Two strings are considered anagrams if by rearranging the letters of one string, we can get the other string. Your program should be able to read two strings from the input and output "YES" if they are anagrams of each other, and "NO" otherwise.

### Input Format
- The first line of input contains a single integer $T$, the number of test cases.
- Each test case consists of two lines. The first line of each test case contains the first string, $A$. The second line of each test case contains the second string, $B$.
### Output Format

For each test case, print "YES" if the two strings are anagrams of each other; otherwise, print "NO". Each output should be in a new line.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq |A|, |B| \leq 10^5$
- The strings consist only of lowercase English letters.
### Sample 1:
Input
Output

```
3
listen
silent
programming
margorpign
cat
tac
```

```
YES
NO
YES
```

### Explanation:
- In the first test case, "listen" and "silent" are anagrams of each other as rearranging the letters of "silent" can form "listen".
- In the second test case, "programming" and "margorpign" are not anagrams since "programming" has two 'm's while "margorpign" has only one.
- In the third test case, "cat" and "tac" are anagrams of each other as rearranging the letters of "tac" can form "cat".

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:46:17.676Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(isAnagrams(s1, s2) ? "YES" : "NO");
        }
        
        sc.close();
	}
	
	public static boolean isAnagrams(String s1, String s2) {
	    HashMap<Character, Integer> map1 = new HashMap<>();
	    for (char ch : s1.toCharArray()) {
	        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
	    }
	    
	    HashMap<Character, Integer> map2 = new HashMap<>();
	    for (char ch : s2.toCharArray()) {
	        map2.put(ch, map2.getOrDefault(ch, 0) + 1);
	    }
	    
	    return map1.equals(map2);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ANAGRAMP)