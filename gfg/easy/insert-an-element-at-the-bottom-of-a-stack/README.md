# Insert at Bottom of Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a stack st containing n integers and an integer x, insert x at the bottom of the stack.

 **Note:**  While displaying the stack, the bottommost element is printed first.

 **Examples :** 

```
Input: st = [4, 3, 2, 1, 8], x = 2
Output: [2, 4, 3, 2, 1, 8]
Explanation: After insertion of 2, the final stack will be [2,4,3,2,1,8].
```

```
Input: st = [5, 3, 1], x = 4
Output: [4, 5, 3, 1]
Explanation: After insertion of 4, the final stack will be [4,5,3,1].
```

 **Constraints:** 
1 ≤ n ≤ 105
0 ≤ x, elements of stack ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T09:56:26.165Z  

```java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        Stack<Integer> s = new Stack<>();
        
        while (!st.isEmpty()) {
            s.push(st.pop());
        }
        
        st.push(x);
        while (!s.isEmpty()) {
            st.push(s.pop());
        }
        
        return st;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1)