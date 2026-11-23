# PYTHCLOP02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Assignment Operators

Listen

In Python, assignment operators are used to set or update the value of a variable. There are basic assignment operators and compound assignment operators. Let's break these down with examples for better understanding.

#### Basic Assignment Operator

The basic assignment operator is the = sign. It assigns the value on its right to the variable on its left. Here's a simple example:

```
length = 15

```

In this example, the  **=**  operator sets the value of `length` to 15.

#### Compound Assignment Operators

 **Compound Assignment Operators**  combine arithmetic operations with assignment. They are just a shorthand way of performing operations on a variable and assigning the result back to the variable.

 **Without**  using the compound assignment operators we write -

```
length = 15
length = length + 5  # Updates length by adding 5 to its current value

```

The same thing  **using**  Compound Assignment Operator would be written as-

```
length = 15
length += 5  # Shorthand for length = length + 5
print(length)  # Output: 20

```

#### We can use any other operator in the same way:

```
- x -= 5  (Subtracts 5 from `x` and assigns the result back to `x`)
- x *= 3  (Multiplies `x` by 3 and assigns the result back to `x`)
- x /= 3  (Divides `x` by 3 and assigns the result back to `x`)*
- x %= 3  (Finds the remainder when `x` is divided by 3 and assigns the result back to `x`)

```

### Task
- Using an assignment operator, output the remainder when length is divided by 3.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T16:41:47.421Z  

```py
length = 11
# Output the remainder when length is divided by 3
length %= 3
print(length)
```

---

[View on CodeChef](https://www.codechef.com/problems/PYTHCLOP02)