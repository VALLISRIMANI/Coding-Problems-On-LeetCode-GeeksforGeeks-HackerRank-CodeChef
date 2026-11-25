# PYTHCLOP08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Logical Operators

Listen

Logical operators help you combine multiple conditions to check if they are True or False. They are often used to make decisions based on multiple criteria.

#### Basic Logical Operations

Here are the basic logical operators and their usage:

#### 1. Logical AND

```
# The AND operator returns True only if both conditions are True.

a = 7
condition = a > 5 and a < 10  # Only True if a is greater than 5 AND less than 10
print(condition)  # Output: True

```

#### 2. Logical OR

```
# The OR operator returns True if at least one of the conditions is True.

a = 7
condition = a > 10 or a < 5  # True if a is greater than 10 OR less than 5
print(condition)  # Output: False

```

#### 3. Logical NOT

```
# The NOT operator reverses the result of the condition. If the condition is True, `not` makes it False. If the condition is False, `not` makes it True.

a = 7
condition = not(a > 5)  # Reverses the result of a > 5
print(condition)  # Output: False

```

### Task

You are given a variable  **`height`**.
You are allowed to enter the waterpark only if your height is between 5 and 10.
Apply the condition and output  **True**  or  **False**  as applicable.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T15:52:48.869Z  

```py
height = 15
# Update the '_' in the code below to solve the problem
print(height > 5 and height < 10) 
```

---

[View on CodeChef](https://www.codechef.com/problems/PYTHCLOP08)