# Pair Sum in Sorted Doubly Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted doubly linked list containing distinct positive integers and an integer target, find all pairs of nodes whose values add up to target.

 **Examples :** 

```
Input:

target = 7
Output: [[1, 6], [2, 5]]
Explanation: There are two pairs (1, 6) and (2,5) with sum 7.
```

```
Input: 

target = 6
Output: [[1, 5]]
Explanation: There is one pairs  (1, 5) with sum 6.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T12:04:34.321Z  

```java
/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        Node start = head;
        Node end = head;
        
        while (end.next != null) {
            end = end.next;
        }
        
        while (start != end && end.next != start) {
            int sum = start.data + end.data;
            
            if (sum == target) {
                result.add(new ArrayList<>(Arrays.asList(start.data, end.data)));
                start = start.next;
                end = end.prev;
            } else if (sum < target) {
                start = start.next;
            } else {
                end = end.prev;
            }
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1)