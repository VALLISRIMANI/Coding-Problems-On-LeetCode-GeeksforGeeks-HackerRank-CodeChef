# LEARNJSP132 - Rating 284

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T13:35:21.829Z  

```js
// Solution

function usersWithRating(onlyViewed, attempted, visited){
      return (visited - onlyViewed);
}

function usersWithHighRating(onlyViewed, attempted, visited) {
    return (visited - onlyViewed - attempted);
}

function solve(N, A, B) {
    var result1 = usersWithRating(A, B, N);
    var result2 = usersWithHighRating(A, B, N);
    console.log(result1, result2);
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP132)