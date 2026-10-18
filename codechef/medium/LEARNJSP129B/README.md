# LEARNJSP129B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Callbacks Function

Listen

Imagine you're at a restaurant. You place an order, and you're told to wait at your table. When your food is ready, the waiter "calls you back" to let you know it's ready for you to pick up.

In JavaScript, a callback function works similarly. It's a function that is passed as an argument to another function. The main function does its job, and when it's done, it "calls back" the callback function to let it know that the task is complete.

Here's a simple example:

```
// Main function
function greet(name, callback) {
  console.log("hello", name);
  
  // Calling back the callback function
  callback();
}

// Callback function
function sayGoodbye() {
  console.log('Goodbye!');
}

// Using the main function with a callback
greet('Alice', sayGoodbye);

```

In this example:

- greet is the main function.
- sayGoodbye is the callback function.
- When greet is called with the name 'Alice' and sayGoodbye as the callback, it prints "Hello, Alice!" and then calls back the sayGoodbye function, which prints "Goodbye!".
### Task
- Submit the code in IDE and observe the flow of the program by the output.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T15:55:02.588Z  

```js
// Submit the code and observe the flow

function greet(name, callback) {
  console.log("hello", name);
  
  // Calling back the callback function
  callback();
}

// Callback function
function sayGoodbye() {
  console.log('Goodbye!');
}

// Using the main function with a callback
greet('Alice', sayGoodbye);
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP129B)