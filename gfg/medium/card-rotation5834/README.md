# Initial Arrangement of Cards

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given n cards numbered from 1 to n. We need to find an initial arrangement of these cards such that the following process removes the cards in the order 1, 2, 3, …, n.

Do the following for every number k from 1 to n:

- Move the first k cards of the deck to the back of the deck, one by one.
- After these k moves, pick the card at the front.
- This card must be equal to k.  If it is, remove it from the deck and continue. If it is not, then no valid arrangement exists.

If such an arrangement of decks is possible, output the arrangement, if it is not possible for a particular value of n then output -1.

 **Examples:** 

```
Input: n = 4
Output: [2, 1, 4, 3]
Explanation:
We initially have [2, 1, 4, 3]
Step1, we move the first card to the end. Deck now is: [1, 4, 3, 2]
Step2, we get 1. Hence we remove it. Deck now is: [4, 3, 2]
Step3, we move the 2 front cards one by one to the end  ([4, 3, 2] -> [3, 2, 4] -> [2, 4, 3]) Deck now is: [2, 4, 3].
Step4, we get 2. Hence we remove it. Deck now is: [4, 3]
Step5, we move the first 3 cards, [4, 3] -> [3, 4] -> [4, 3] -> [3, 4]. Deck now is: [3, 4] 
Step6, we get 3. Hence we remove it. Deck now is: [4] Finally, we're left with a single card and thus, we stop. 
```

```
Input : n = 3
Output: [3, 1, 2]
Explanation:
We initially have [3, 1, 2]
Step1, we move the first card to the end. Deck now is : [1, 2, 3]
Step2, we get 1. Hence we remove it. Deck now is : [2,3]
Step3, we move the 2 front card on e by one to the end ([2,3] -> [3,2] -> [2,3]) Deck now is : [2, 3].
Step4, we get 2. Hence we remove it. Deck now is : [3] Finally, we're left with single card and thus, we stop.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:39:29.903Z  

```java
class Solution {
    public ArrayList<Integer> rotation(int n) {
        // Code Here
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(i);
        }
        
        int[] result = new int[n];
        for (int card = 1; card <= n; card++) {
            for (int j = 0; j < card; j++) {
                q.offer(q.poll());
            }
            
            int position = q.poll();
            result[position] = card;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : result) {
            ans.add(x);
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/card-rotation5834/1)