# QUOMQD03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Word Counting

In this example, we demonstrate how to declare a string variable, assign a value, and determine its length in Java. This method provides a simple way to count and display the total number of characters in a given string.

 **When executed, the code will show:** 

```
The total number of characters in the sentence is: 21

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T12:42:25.967Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare a string variable and assign it a value.
        // This variable "sentence" contains the text for which we want to count the total number of characters.
        String sentence = "Learning Java is fun!";

        // Step 2: Use the length() method to calculate the number of characters in the string.
        // The length() method returns the total count of characters, including spaces and punctuation marks.
        // Print the result to the console along with a descriptive message.
        System.out.println("The total number of characters in the sentence is: " + sentence.length());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD03)