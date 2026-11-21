# Sleep

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer `millis`, write an asynchronous function that sleeps for `millis` milliseconds. It can resolve any value.

 **Note**  that  *minor*  deviation from `millis` in the actual sleep duration is acceptable.

 

Original
JavaScript
 **Example 1:** 

```
Input: millis = 100
Output: 100
Explanation: It should return a promise that resolves after 100ms.
let t = Date.now();
sleep(100).then(() => {
  console.log(Date.now() - t); // 100
});

```

 **Example 2:** 

```
Input: millis = 200
Output: 200
Explanation: It should return a promise that resolves after 200ms.

```

 

 **Constraints:** 

- 1 <= millis <= 1000

## Solution

**Language:** JavaScript  
**Runtime:** 51 ms (beats 16.86%)  
**Memory:** 55.4 MB (beats 10.88%)  
**Submitted:** 2026-11-21T16:29:10.023Z  

```js
/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    return new Promise((resolve) => setTimeout(resolve, millis));
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */
```

---

[View on LeetCode](https://leetcode.com/problems/sleep/)