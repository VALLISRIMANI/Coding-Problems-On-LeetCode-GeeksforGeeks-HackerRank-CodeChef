# Message Spreading

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

There are n students in a class, each in possession of a different funny story.  They wish to share funny stories with each other by sending electronic messages. Assume that a sender includes all the funny stories he or she knows at the time the message is sent and that a message may only have one addressee. What is the minimum number of messages they need to send to guarantee that every one of them gets all the funny stories?

 **Examples :** 

```
Input: 2
Output: 2
Explanation: Person 1 sends a message to Person 2, Person 2 sends message to Person 1.A total of 2 messages are sent.
```

```
Input: 1
Output: 0
Explanation: No messages are sent.

```

 **Constraints:** 
1<=n<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:09:40.046Z  

```java
class Solution {
    static int minimumMessages(int n) {
        // code here
        return 2 * (n - 1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/message-spreading4258/1)