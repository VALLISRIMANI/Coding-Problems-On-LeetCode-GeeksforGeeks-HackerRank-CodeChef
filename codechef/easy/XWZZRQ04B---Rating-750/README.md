# XWZZRQ04B - Rating 750

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### MCQ - Find the output

What will be the output of the following Java program if the user enters the values: 5 10 15 20 25?

```
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[2]);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:14:41.486Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/XWZZRQ04B)