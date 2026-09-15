# ANAGRAMP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T15:03:41.509Z  

```java
public static String longestCommonPrefix(String[] strs) {
    //write your code here...
    Arrays.sort(strs);
    
    String word1 = strs[0], word2 = strs[strs.length - 1];
    
    int i = 0, j = Math.min(word1.length(), word2.length());
    
    while (i < j) {
        if (word1.charAt(i) != word2.charAt(i)) {
            break;
        }
        
        i++;
    }
    
    return word1.substring(0, i);
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ANAGRAMP)