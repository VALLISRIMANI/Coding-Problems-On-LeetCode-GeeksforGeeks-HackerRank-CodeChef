# LEARNJSP23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Float datatype

Listen

In JS, you don't need to explicitly specify the type of a variable during declaration. The type is inferred based on the kind of value assigned to the variable.

For example if you put decimal values in a variable, the type of variable becomes float.

```
const pi = 3.14;

```

### Task

Write a program which does the following:

- Find the area of a circle whose radius is 8.9. Take pi = 3.14
- Declare variables radius, pi and area and assign the relevant values to them
- Output the area, you don't need to output any other text.

Note: Formula for the area of a circle is $pi \times radius \times radius$

 **Expected output:** 

```
248.71940000000004

```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:37:10.142Z  

```js
// your code goes here
var radius = 8.9;
const pi = 3.14;
var area = pi * radius * radius;

console.log(area);
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP23)