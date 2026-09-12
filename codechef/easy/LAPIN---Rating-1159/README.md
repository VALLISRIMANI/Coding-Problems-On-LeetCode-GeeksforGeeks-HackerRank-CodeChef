# LAPIN - Rating 1159

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Lapindromes

 *Lapindrome*  is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example  ***gaga**  *is a lapindrome, since the two halves  ***ga***  and  ***ga**  *have the same characters with same frequency. Also,  ***abccab***,  ***rotor**  *and  ***xyzxy***  are a few examples of lapindromes. Note that  ***abbaab** * is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.

### Input:
First line of input contains a single integer  **T**, the number of test cases.
Each test is a single line containing a string  **S**  composed of only lowercase English alphabet.

### Output:
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.

### Constraints:
- 1 ≤ T ≤ 100
- 2 ≤ |S| ≤ 1000, where |S| denotes the length of S
### Sample 1:
Input
Output

```
6
gaga
abcde
rotor
xyzxy
abbaab
ababc
```

```
YES
NO
YES
YES
NO
NO
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:27:51.346Z  

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
            String str = sc.next();
            System.out.println(isLapindrome(str) ? "YES" : "NO");
        }
        
        sc.close();
	}
	
	public static boolean isLapindrome(String str) {
	    int n = str.length();
	    
	    HashMap<Character, Integer> map1 = new HashMap<>();
	    for (int i = 0; i < n / 2; i++) {
	        char ch = str.charAt(i);
	        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
	    }
	    
	    int start = n % 2 == 0 ? n / 2 : (n / 2) + 1;
	    HashMap<Character, Integer> map2 = new HashMap<>();
	    for (int i = start; i < n; i++) {
	        char ch = str.charAt(i);
	        map2.put(ch, map2.getOrDefault(ch, 0) + 1);
	    }
	    
	    return map1.equals(map2);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LAPIN)