# JAPROJPR14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Digital Clock & Countdown timer - User Input

Let us begin and create the project step by step.

We have created a skeleton structure of the overall project for you in the IDE.
As a 1st step, let us accept user input on whether he wants to display the 'Digital Clock' or the 'Countdown timer' and then call the corresponding function

### Task

Update the `userChoice()` function to achieve the following.
The user will input either '1' or '2' to select the option they want to use

- If the user input is 1 - call the digital_clock() function
- If the user input is 2 Ask the user for the countdown target time with the prompt - 'Enter the number of seconds to countdown:' and accept an integer input call the countdown_timer() function with seconds as the variable passed to it
- If the user input is anything else - output 'Invalid choice!'

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:23:22.275Z  

```cpp
            System.out.println("Invalid choice!");
        } else {
        }
    }
    
    public static void digitalClock() {
        System.out.println("Digital clock is displayed.");
    }
    
    public static void countdownTimer(int seconds) {
        System.out.println("Counting down from " + seconds + " seconds.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROJPR14)