# LEARNJSP129C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Arrow Function

Listen

An arrow function is just another way to write a function in JavaScript, introduced in newer versions of the language. It's more concise and often easier to read.

Here's how you write a regular function:

```
function add(a, b) {
  return a + b;
}

```

And here's how you write the same function using an arrow function:

```
const add = (a, b) => {
  return a + b;
};

```

Or, if the function body is just a single expression, you can even omit the `return` keyword and the curly braces:

```
const add = (a, b) => a + b;

```

Here's a simple example using an arrow function as a callback:

```
// Main function with an arrow function as a callback
function doSomething(callback) {
  console.log('Doing something...');
  
  // Calling back the arrow function
  callback();
}

// Using the main function with an arrow function as a callback
doSomething(() => {
  console.log('Callback function called!');
});

```

In this example:

- doSomething is the main function.
- The arrow function () => { console.log('Callback function called!'); } is used as the callback.
- When doSomething is called with the arrow function as the callback, it logs "Doing something..." and then calls back the arrow function, which logs "Callback function called!".
### Task
- Submit the code in IDE and observe the flow of the program by the output.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T15:55:21.775Z  

```js
// Submit the code and observe the flow

// Main function with an arrow function as a callback
function doSomething(callback) {
  console.log('Doing something...');
  
  // Calling back the arrow function
  callback();
}

// Using the main function with an arrow function as a callback
doSomething(() => {
  console.log('Callback function called!');
});
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP129C)