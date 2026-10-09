# LEARNJSP20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Properties of Variables

Listen

We learned that a variable is a labelled box which can store many different types of values. You can also change the value of a variable in your code.

For example

```
var age = 25;
console.log(age);

// Update age
age = 26;
console.log(age);

```

The above code will output

```
25
26

```

We are going to use variables all the time in the coming lessons. So let's learn a few more stuff about them.

Rules for variable names:

- A variable name can only contain alphabets, numbers and underscores (ie. A-Z, a-z, 0-9, and _).
- A variable name cannot start with a number.
- A variable name cannot have spaces in between.
- Variable names are case-sensitive (age, Age and AGE are three different variables).
### Note
- Reassignment (for let and var): Variables declared with let and var can be reassigned. let count = 10; count = count + 1; // Reassignment is allowed
- Immutability (for const): Variables declared with const cannot be reassigned. const maxAttempts = 3; // maxAttempts = 4; // Error: Assignment to a constant variable

Be sure to follow these rules when creating a variable so as not to get errors.

### Task

Some code is written in the editor to print "Code Chef". However, the variable name(s) are not following the rule. Can you spot the mistake and fix it?

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T15:35:07.669Z  

```js
// Correct the variable name to adhere to the rules.
var first_name = "Code";
var last_name = "Chef";
console.log(first_name, last_name);
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP20)