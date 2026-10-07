# LEARNJSP19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Declaring a variable

Listen

To declare a variable, you use the `var`, `let`, or `const` keyword, followed by the variable name. Here's a short concept with examples:

### Variable Declaration in JavaScript:
- Using var (historical, less preferred): The var keyword declares a variable globally or locally to an entire function, regardless of block scope. var age = 25; console.log(age); // Output: 25
- Using let (block-scoped): The let keyword declares a block-scoped variable, which means it is only accessible within the block or statement where it is defined. let name = "John"; console.log(name); // Output: John
- Using const (block-scoped, constant): The const keyword declares a block-scoped variable that cannot be reassigned. It is a constant once assigned. const PI = 3.14; console.log(PI); // Output: 3.14
### Notes:
- Variable Naming: Variable names should be meaningful and follow camelCase convention (e.g., myVariable, totalAmount).
- Dynamic Typing: JavaScript is a dynamically-typed language, so you don't need to explicitly mention the type of the variable; it is determined at runtime.
- Initializing Variables: You can declare and initialize a variable in a single step. let greeting = "Hello, World!";
### Task

Write a program which does the following

- There is a variable named number having the value of 20 in the editor.
- Use the console statement to output the value of (number - 1).

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T06:17:39.385Z  

```js
// Complete the code

var number = 20;
console.log(number - 1);
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP19)