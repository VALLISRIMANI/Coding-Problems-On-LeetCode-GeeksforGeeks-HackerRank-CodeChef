# Expression Add Operators

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string `num` that contains only digits and an integer `target`, return  ***all possibilities**  to insert the binary operators  *`'+'`*,  *`'-'`*, and/or  *`'* '` *between the digits of* `num` *so that the resultant expression evaluates to the* `target` *value*.

Note that operands in the returned expressions  **should not**  contain leading zeros.

 **Note**  that a number can contain multiple digits.

 

 **Example 1:** 

```
Input: num = "123", target = 6
Output: ["1 *2* 3","1+2+3"]
Explanation: Both "1 *2* 3" and "1+2+3" evaluate to 6.

```

 **Example 2:** 

```
Input: num = "232", target = 8
Output: ["2 *3+2","2+3* 2"]
Explanation: Both "2 *3+2" and "2+3* 2" evaluate to 8.

```

 **Example 3:** 

```
Input: num = "3456237490", target = 9191
Output: []
Explanation: There are no expressions that can be created from "3456237490" to evaluate to 9191.

```

 

 **Constraints:** 

- 1 <= num.length <= 10
- num consists of only digits.
- -231 <= target <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 132 ms (beats 30.11%)  
**Memory:** 52.8 MB (beats 55.89%)  
**Submitted:** 2026-08-17T15:47:03.837Z  

```java
class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", num, target, 0, 0, 0);
        Collections.sort(result);
        return result;
    }
    
    private void backtrack(List<String> result, String path, String s, int target, int index, long eval, long prevOperand) {
        if (index == s.length()) {
            if (eval == target) {
                result.add(path);
            }
            return;
        }
        
        for (int i = index; i < s.length(); i++) {
            if (i != index && s.charAt(index) == '0') break;
            
            String currStr = s.substring(index, i + 1);
            long currNum = Long.parseLong(currStr);
            
            if (index == 0) {
                backtrack(result, currStr, s, target, i + 1, currNum, currNum); 
            } else {
                backtrack(result, path + "+" + currStr, s, target, i + 1, eval + currNum, currNum);
                backtrack(result, path + "-" + currStr, s, target, i + 1, eval - currNum, -currNum);
                backtrack(result, path + "*" + currStr, s, target, i + 1,
                          eval - prevOperand + prevOperand * currNum,
                          prevOperand * currNum);
            }
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/expression-add-operators/)