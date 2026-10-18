# LEARNJSP127

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Parameters, Arguments

Listen

Note that there is a difference between `Parameters` and `Arguments` of a function.

`Parameters` are the variables that are listed as part of the method definition. They act like placeholders for the values that the method can accept.

`Arguments` are the actual values which are passed to the method when you call it.

Check the code template below

- a, b are Parameters inside the function
- A, B are Arguments passed to the function

```
functions addNumbers(a, b){
    return a + b;
}
// Calling the function with arguments
var A = 5;
var B = 3;
var result = addNumbers(A, B);
console.log("Sum:", result);

```

 **Note** : We can also use the same variable names for both the parameter and the argument.

### Task

The code given in the IDE is incorrect.
Can you debug the code to give the correct output?
Check the input and expected output below.

### Sample 1:
Input
Output

```
 
```

```
Hello, Alice!
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T15:53:38.866Z  

```js
// Debug the following incorrect code to get the desired output

function greet(name){
   console.log("Hello, " + name + "!");
}

var name = "Alice";
greet(name);
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP127)