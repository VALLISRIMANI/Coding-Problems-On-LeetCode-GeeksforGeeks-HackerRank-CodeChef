# LEARNJSP61

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### If & Else Statements

Listen

We use conditions in code for decision-making and controlling the flow of a program.

The  **if-else**  statement in JavaScript is used to make decisions in your code. It allows your program to execute different blocks of code depending on whether a given condition is true or false.

Here's a simple explanation:

```
if (condition) {
  // This block of code runs if the condition is true
} else {
  // This block of code runs if the condition is false
}

```

Here's how it works:

- The if keyword is followed by a set of parentheses (). Inside the parentheses, you write a condition (something that can be either true or false).
- If the condition inside the parentheses is true, the code inside the first set of curly braces { } (after if) is executed.
- If the condition is false, the code inside the second set of curly braces { } (after else) is executed.

Here's an example with actual code:

```
let age = 18;

if (age >= 13) {
  console.log("You're a teenager!");
} else {
  console.log("Hello baby!");
}

```

In this example, if the `age` variable is 13 or older, it will print "You're a teenager!" Otherwise, it will print "Hello baby!" The condition `age >= 13` is true or false based on whether the value of `age` is greater than or equal to 13.

Complete the given program which is supposed to do the following:

- Let's think of a real-life example where we need to find out if a person is old enough to vote.
- Compare the age (25) with the voting age limit, which is set to 18.
- It should output the following: "Old enough to vote!" if age is greater than or equal to votingAge "Not old enough to vote." if age is lesser than votingAge

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T13:58:24.375Z  

```js
// Replace the '__' with appropriate comparison operator

var age = 25;
var votingAge = 18;

if(age >= votingAge) {
  console.log("Old enough to vote!");
}
else {
  console.log("Not old enough to vote.");
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP61)