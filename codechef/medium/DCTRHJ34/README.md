# DCTRHJ34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Output for String Comparison

What will be the output of the following Java code?

```
class Codechef {
    public static void main(String[] args) {
        String greeting1 = "Hello";
        String greeting2 = "HELLO";
        String greeting3 = "Hello World";
        
        System.out.println(greeting1.equalsIgnoreCase(greeting2)); // Compare greeting1 and greeting2
        System.out.println(greeting1.equalsIgnoreCase(greeting3)); // Compare greeting1 and greeting3
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T14:07:48.906Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        // Declaring the correct password and the user input
        String correctPassword = "SecurePass";  // Stored password
        String userInput = "securepass";        // User input

        // Using equalsIgnoreCase to compare both strings ignoring case
        boolean isPasswordCorrect = correctPassword.equalsIgnoreCase(userInput);

        // Printing the result
        System.out.println("Is the password correct? " + isPasswordCorrect);  // Output: true
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ34)