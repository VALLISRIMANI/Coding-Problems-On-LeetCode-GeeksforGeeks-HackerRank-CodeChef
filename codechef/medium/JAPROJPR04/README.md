# JAPROJPR04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Adding loop

Did you notice in the previous problem that we got only $1$ guess.

Ideally - the system should prompt the user for another guess.

Can you think of a way to incorporate this using loops?

### Task

Add a `while` loop and a `break` statement to the `runGuess()` function to complete the project.
The ideal flow is the 'Secret number' and user guessed number are compared with the following result

- If the user guess is greater than or less than 'Secret number' by $10$ - the system output is 'Cold' and the user is prompted to guess again
- If the user guess is $+~/-~ 10$ from the 'Secret number' - the system output is 'Hot' and the user is prompted to guess again
- If the user guess matches the 'Secret number' - the system prompts 'You guessed it right!!' and the Project terminates

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:34:39.287Z  

```cpp
    }
            return "Hot";
        }
            return "Cold";
        } else if (number == guess) {
            return "Right";
        } else {
    public static String giveHint(int number, int guess) {
        if (guess > (number + 10) || guess < (number - 10)) {
    // Method to provide hints based on the user's guess

    }
        return rand.nextInt(100) + 1;
        Random rand = new Random();
    public static int getRandomNumber() {
    // Method to generate a random number between 1 and 100

import java.util.*;

public class Codechef {
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROJPR04)