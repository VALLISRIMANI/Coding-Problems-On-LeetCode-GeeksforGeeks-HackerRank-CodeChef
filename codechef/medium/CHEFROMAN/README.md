# CHEFROMAN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and Roman Numbers

Chef has found an ancient Roman numeral and wants to know its integer value.

Roman numerals use the following symbols:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000

Normally, symbols are added from left to right.
For example:
 **III = 3**,  **VIII = 8**,  **XII = 12** 

However, if a smaller value comes before a larger one, it is subtracted:

- I before V (5) or X (10) → 4 or 9
- X before L (50) or C (100) → 40 or 90
- C before D (500) or M (1000) → 400 or 900

Your task is to help Chef convert the given Roman numeral string S into its integer value.

## Function Declaration
### Function Name

$romanToInt$ – This function converts a given Roman numeral string into its corresponding integer value.

### Parameters
- $s$ : A string representing a valid Roman numeral. The string contains only the characters I, V, X, L, C, D, and M.
### Return Value
- Returns an integer representing the decimal (base-10) value of the given Roman numeral string.
## Constraints
- $1 \le |S| \le 15$
- $S \text{ contains only the characters } I, V, X, L, C, D, \text{ and } M$.
- $\text{It is guaranteed that } S \text{ is valid and represents a number between } 1 \text{ and } 3999$.
### Input Format
- The input consists of a single line containing a string S, which represents a Roman numeral.
### Output Format
- Print a single integer — the decimal value of the Roman numeral.
### Sample 1:
Input
Output

```
XLII
```

```
42

```

### Sample 2:
Input
Output

```
CMXLIV

```

```
944

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T12:03:57.576Z  

```java
public static int romanToInt(String s) {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = romanValue(s.charAt(i));

            // Subtract if next numeral is bigger
            if (i + 1 < n && current < romanValue(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    // ----------------- UTILITY FUNCTION -----------------
    public static int romanValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFROMAN)