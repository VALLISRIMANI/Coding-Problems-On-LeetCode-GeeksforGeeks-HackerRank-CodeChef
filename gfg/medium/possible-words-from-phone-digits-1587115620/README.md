# Possible Words From Phone Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing digits, generate all possible words that can be formed by pressing these digits on a phone keypad, as shown in the figure. Digits 0 and 1 do not map to any letters, so they do not contribute to the generated combinations.

 **Note:**  Return the combinations in any order. The driver code will print them in sorted order.

 **Examples :** 

```
Input: arr[] = [2, 3]
Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
Explanation: When we press 2 and 3 total 3 x 3 = 9 possible words formed.
```

```
Input: arr[] = [2]
Output: [a, b, c]
Explanation: When we press 2 total 3 possible words formed.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 9
0 ≤ arr[i] ≤ 9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T13:20:23.641Z  

```java
class Solution {
    private static final String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> result = new ArrayList<>();

        if (arr.length == 0) return result;

        backtrack(arr, 0, new StringBuilder(), result);

        return result;
    }

    public void backtrack(int[] arr, int idx, StringBuilder current,  ArrayList<String> result) {
        if (idx == arr.length) {
            result.add(current.toString());
            return;
        }
        
        if (arr[idx] == 0 || arr[idx] == 1) {
            backtrack(arr, idx + 1, current, result);
            return;
        }

        String letters = map[arr[idx]];

        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(arr, idx + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1)