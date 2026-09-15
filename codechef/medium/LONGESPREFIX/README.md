# LONGESPREFIX

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Longest Common Prefix

You are given a list of $N$ strings. Your task is to find the  **longest common prefix**  shared by all the strings.

If there is  **no common prefix**, return an empty string (`""`).

## Function Declaration
### Function Name

$longestCommonPrefix$ – This function finds the longest common prefix among a list of strings.

### Parameters
- $strs$ : A reference to a vector of strings containing $N$ strings.
### Return Value
- Returns a string representing the longest common prefix among all given strings.
- Returns an empty string ("") if no common prefix exists.
### Constraints
- $1 \leq N \leq 200$
- $0 \leq |strs[i]| \leq 200$
- Each string contains only lowercase English letters ($a – z$).
### Input Format
- The first line contains a single integer $N$, the number of strings.
- The next $N$ lines each contain one string.
### Output Format
- Print the longest common prefix among all strings.
- If no common prefix exists, print an empty string $""$.
### Sample 1:
Input
Output

```
4
interview
internet
internal
interval

```

```
inter

```

### Explanation:

All strings start with `"inter"`, which is the longest common prefix.

### Sample 2:
Input
Output

```
3
apple
ape
april

```

```
ap

```

### Explanation:

All strings start with `"ap"` — that’s the longest common prefix.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T15:03:38.546Z  

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

[View on CodeChef](https://www.codechef.com/problems/LONGESPREFIX)