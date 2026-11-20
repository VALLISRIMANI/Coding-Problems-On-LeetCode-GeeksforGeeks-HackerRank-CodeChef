# XWZZRQ03B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Iterating Arrays with For Loop

In this example, we demonstrate how to take input of numbers from the user and print only the numbers that are even.

### Sample 1:
Input
Output

```
22
23
24
25
26
```

```
Even numbers from input:
22
24
26
```

### Sample 2:
Input
Output

```
23
25
27
29
31
```

```
Even numbers from input:

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:14:25.794Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 1: Scanner for user input

        int[] numbers = new int[5]; // Step 2: Declare an array of size 5

        // Step 3: Take input from user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 4: Print only even numbers
        System.out.println("Even numbers from input:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close(); // Step 5: Close scanner
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/XWZZRQ03B)