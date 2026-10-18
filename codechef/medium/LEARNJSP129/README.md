# LEARNJSP129

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T15:53:55.346Z  

```js
// Click on submit to see the result

// Global variable
var x = 10;

function myFunction(){
    // Local variable with the same name as the global variable
    var x = 20;
    
    // Accesses the local variable
    console.log(x);
}

myFunction();
// Output: 20

console.log(x);
// Output: 10 (global variable is not affected)
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP129)