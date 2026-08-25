# Delete Smaller Than Next

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array **arr[]** and a number  **k**. Delete  **k**  elements that are smaller than the next element (i.e., we delete arr[i] if arr[i] < arr[i+1]) or become smaller than the next because the next element is deleted.

 **Examples:** 

```
Input: arr[] = [20, 10, 25, 30, 40], k = 2
Output: [25, 30, 40]
Explanation: First we delete 10 because it follows arr[i] < arr[i+1]. Then we delete 20 because 25 is moved next to it and it also starts following the condition.

```

```
Input: arr[] = [3, 100, 1], k = 1
Output: [100, 1] 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T05:21:35.218Z  

```java
class Solution {
    public static ArrayList<Integer> deleteElement(int arr[], int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int count = 0;
        
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() < arr[i] && count < k) {
                st.pop();
                count++;
            }
            st.push(arr[i]);
        }
        
        while (!st.isEmpty()) {
            result.add(st.pop());
        }
        
        Collections.reverse(result);
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-array-elements-which-are-smaller-than-next-or-become-smaller3115/1)