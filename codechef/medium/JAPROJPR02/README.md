# JAPROJPR02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Get a random number

Let us start with the simplest component. Our project has to generate a hidden number randomly. How to generate a random number?

### How to generate a random number?

In Java, we can use the `Random` class from the `java.util` package to generate a random integer. The `nextInt()` method generates a random number between $0$ and a specified bound (exclusive). We can scale this value to the desired range.

To generate a random number between a specific range, you can use the following approach:

 **Syntax:** 

```
 // Create an instance of Random
Random random = new Random();

// Generate a random number between 0 (inclusive) and 100 (exclusive)
int randomNumber = random.nextInt((max - min) + 1) + min;

```

Where:

- random is the instance of the Random class that generates a random number.
- (max - min + 1) scales the number to the range [min, max].
- min is the lower bound, and max is the upper bound of the range.
### Task

Update the function `getRandomNumber()` in the IDE to generate a random number between 1 and 100 (Both inclusive).

Run the code and see the output in Preview tab. When you are satisfied with your output, you can  **Submit**  your code.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:24:35.618Z  

```cpp


        int min = 1; // Define the minimum range
        int max = 100; // Define the maximum range

        // Generate a random number in the range [min, max]
        int randNumber = random.nextInt((max - min) + 1) + min;
        return randNumber;
    }

    public static void main(String[] args) throws Exception {
        // Generate and print random number
        System.out.println("Random Number: " + getRandomNumber());
        Random random = new Random();

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROJPR02)