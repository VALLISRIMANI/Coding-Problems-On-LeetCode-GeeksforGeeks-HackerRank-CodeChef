# JAPROJPR15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Digital Clock & Countdown timer - Fix Time

Let us now update the digital_clock() function.

If we ask our trusted friend `ChatGPT` about how to display the current time using java - we get the following response

```
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void digital_clock (String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        // Display the formatted current time
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current Time: " + formattedTime);
    }
}

```

### Task

Review the syntax given above and paste it into the digital_clock() function.

Notice the output - You get a static clock - i.e. - time is displayed only once.
Can you update the function such that the time is updated every second?

Hint:

- Think while() loop
- Ask ChatGPT on how to update the time every second

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:29:25.672Z  

```cpp
                System.err.println("Error: " + e.getMessage());
                Thread.currentThread().interrupt(); 
            } catch (InterruptedException e) {
                TimeUnit.SECONDS.sleep(1);
            try {

                break;
            }
        }
    }

    public static void countdownTimer(int seconds) {
        System.out.println("Counting down from " + seconds + " seconds.");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROJPR15)