# Check Linked list of Words a Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a linked list with string data, check whether the combined string forms is palindrome. 

 **Example:** 

```
Input:

Output : true
Explanation: As string "abcddcba" is palindrome the function should return true.
```

```
Input:

Output : false
Explanation: As string "abcdba" is not palindrome the function should return false.
```

**Constraints:
**1 ≤ Node.data.length ≤ 103
1 ≤ list.length ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T06:26:09.244Z  

```java
/* Node Structure
class Node {
    String data;
    Node next;
    Node(String x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public boolean compute(Node root) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        Node temp = root;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }
        
        int left = 0, right = sb.length() - 1;
        
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/linked-list-of-strings-forms-a-palindrome/1)