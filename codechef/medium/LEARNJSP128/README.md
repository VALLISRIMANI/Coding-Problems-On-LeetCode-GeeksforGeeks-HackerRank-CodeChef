# LEARNJSP128

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Variable scope

Listen

Let's talk about local and global scope in the context of JavaScript functions:

## Local Scope:

 **Local scope**  refers to variables that are declared inside a function. These variables are only accessible within that specific function. They are like secret ingredients that can only be used inside the kitchen (function).

```
function myFunction() {
    var localVar = "I'm local!";
    console.log(localVar);
}

myFunction(); // Output: I'm local!
console.log(localVar); // Error: localVar is not defined

```

In this example, `localVar` is a local variable. It can be used inside the `myFunction` kitchen, but if you try to access it outside, you'll get an error.

## Global Scope:

 **Global scope**, on the other hand, refers to variables that are declared outside of any function. These variables can be accessed from anywhere in your entire code, like ingredients available in the entire house.

```
var globalVar = "I'm global!";

function anotherFunction() {
    console.log(globalVar);
}

anotherFunction(); // Output: I'm global!
console.log(globalVar); // Output: I'm global!

```

Here, `globalVar` is a global variable. It can be used inside any function or even outside functions. It's like an ingredient you can use in any part of your house (code).

## Local vs Global:
- Local variables: Known and accessible only inside the function where they are declared.
- Global variables: Known and accessible throughout the entire code, both inside and outside functions.

Understanding local and global scope is essential for writing clean and efficient code. It helps you keep things organized and prevents unintended interactions between different parts of your code.

Review the code in the IDE and click on 'Submit' to know the result.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T15:53:53.603Z  

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

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP128)