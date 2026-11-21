# Array Prototype Last

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write code that enhances all arrays such that you can call the `array.last()` method on any array and it will return the last element. If there are no elements in the array, it should return `-1`.

You may assume the array is the output of `JSON.parse`.

 

 **Example 1:** 

```
Input: nums = [null, {}, 3]
Output: 3
Explanation: Calling nums.last() should return the last element: 3.

```

Original
JavaScript
 **Example 2:** 

```
Input: nums = []
Output: -1
Explanation: Because there are no elements, return -1.

```

 

 **Constraints:** 

- arr is a valid JSON array
- 0 <= arr.length <= 1000

## Solution

**Language:** JavaScript  
**Runtime:** 38 ms (beats 88.49%)  
**Memory:** 55.8 MB (beats 6.43%)  
**Submitted:** 2026-11-21T16:27:41.055Z  

```js
/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    if (this.length === 0) {
        return -1;
    }
    return this[this.length - 1];
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */
```

---

[View on LeetCode](https://leetcode.com/problems/array-prototype-last/)