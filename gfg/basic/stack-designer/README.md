# Array to Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[],**  push the elements of the array into a stack and then print them while popping.
 **Note:** No need to print extra line after printing the stack elements.

 **Examples:** 

```
Input: arr = [1, 2, 3, 4, 5]
Output: 5 4 3 2 1
Explanation: Elements are pushed and then popped from the top of the stack in the order 5, 4, 3, 2, 1.

```

```
Input: arr = [1, 6, 43, 1, 2, 0, 5]
Output: 5 0 2 1 43 6 1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T09:42:23.664Z  

```java
class Solution {

    // Push elements of an array into a stack.
    public static Stack<Integer> push(int arr[]) {
        
        // code here
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        return stack;
    }

    // Print elements of a stack and pop them.
    public static void printAndPop(Stack<Integer> s) {
        // code here
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/stack-designer/1)