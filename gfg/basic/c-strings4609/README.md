# C++ Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings  S1 and S2. You have to concatenate both the strings and print the concatenated string.

 **Example 1:** 

```
Input:
S1 = "Geeksfor"
S2 = "Geeks"
Output: GeeksforGeeks
Explanation: Combined "Geeksfor" and "Geeks"
```

 

 **Example 2:** 

```
Input:
S1 = "Practice"
S2 = "Hard"
Output: PracticeHard
Explanation: Combined "Practice" and "Hard"
```

 

 **Your Task:** 
You dont need to read input or print anything. Complete the function  **conCat()**  which accepts two strings S1 and S2 as input parameter and returns concatenated string.

 **Expected Time Complexity:** O(|S1| + |S2|).
 **Expected Auxiliary Space:** O(|S1| + |S2|).
where N is the length of a String

 **Constraints:** 
1 <= |S1|, |S2| <= 105
|S| denotes the length of the string S.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T08:54:10.380Z  

```java
class Sol {
    String conCat(String s1, String s2) {
        // code here.
        StringBuilder sb = new StringBuilder(s1);
        sb.append(s2);
        
        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/c-strings4609/1)