# LEARNJSP129

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calling a function within function

Listen

Functions can also call other functions.

Check the sample code given below

```
// Function to calculate the square of a number
function square(num){
    return num * num;
}
function squareAndDouble(num){
    // Call the square function to calculate square
    var squared = square(num);

    // Double the squared result
    return 2 * squared;
}
// Call the squareAndDouble function with the argument 3
result = squareAndDouble(3);

console.log("Result:", result);    // Output will be 'Result: 18'

```

### Task
- The editor contains an incomplete code.
- Update the function greetAndCapitalize by calling the above-defined functions inside it to get the expected output.

 **Expected output** 

```
Final Result: HELLO, ALICE!

```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T15:54:50.957Z  

```js
function greet(name){
    return "Hello, " +  name + "!";
}
function capitalize(text){
  // toUpperCase() is an inbuilt JS method that converts a string to uppercase letters
    return text.toUpperCase();
}


function greetAndCapitalize(name){
   // complete the function code 
   return greet(capitalize(name));
}

// Call the functions
var name = "Alice";
var finalResult = greetAndCapitalize(name);

// Display the results
console.log("Final Result:", finalResult);
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP129)