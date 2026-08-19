# JAPROJPR03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Comparing the guess

We have now generated the random number.

Let us incorporate the algorithm or the judge which evaluates and gives us clues.

- The 'Secret number' and user guessed number are compared with the following result If the user guess is greater than or less than 'Secret number' by 10 - the system output is 'Cold' If the user guess is + / - 10 from the 'Secret number' - the system output is 'Hot' If the user guess matches the 'Secret number' - the system prompts 'You guessed it right!!'
### Task

Update the `giveHint` in the IDE to meet the conditions defined above

 **Note:**  We are just writing the logical conditions here.
There is one last step remaining.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:30:25.355Z  

```cpp
    }

    // Method to run the guessing game
    public static void runGuess() {
        
        
        if (Math.abs(number - guess) <= 10) return "Hot";
        if (number == guess) return "Right";
    public static String giveHint(int number, int guess) {
    // Method to give a hint based on the user's guess
    }

        return rand.nextInt(100) + 1;  // Generate a random number between 1 and 100
        Random rand = new Random();
    public static int getRandomNumber() {
    // Method to generate a random number between 1 and 100

public class Codechef {
        int secretNumber = getRandomNumber();
        return "Cold";
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROJPR03)