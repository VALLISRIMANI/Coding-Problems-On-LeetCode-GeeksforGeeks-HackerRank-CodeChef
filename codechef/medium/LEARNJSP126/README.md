# LEARNJSP126

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Return values

Listen

Functions in JavaScript can serve two primary purposes when it comes to providing information to the caller: they can either return a value or print an output.

Now, let's look at a function with a `return` statement:

```
function addNumbers(a, b) {
    var result = a + b;
    return result;
}

var num1 = 10;
var num2 = 20;

var sum = addNumbers(num1, num2);
console.log(sum); // output: 30

```

- return: This is the keyword used to specify the value that the function should return. The return statement ends the execution of the function and sends the specified value back to the calling code.
- var result = a + b;: This line calculates the sum of the a and b parameters and stores it in a variable called result. This variable is then returned by the function.

Understanding the structure and keywords of a function in JavaScript is fundamental, as it allows you to create modular and reusable code. Functions play a key role in making your code more organized and efficient.

### Task

Update the function given in the IDE to output the following to the IDE by printing from inside the function.

- $A^2 + 2 *A* B + B^2$
- $A + B$

Check sample output below.

### Sample 1:
Input
Output

```
3 5

```

```
64
8

```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T15:53:08.824Z  

```js
// Complete the code  


function computeValue(a, b) {
   //Write function logic as per the task on the left
   console.log(a * a + 2 * a * b + b * b);
   console.log(a + b);
}

const A = 3; 
const B = 5; 
computeValue(A, B);


```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP126)