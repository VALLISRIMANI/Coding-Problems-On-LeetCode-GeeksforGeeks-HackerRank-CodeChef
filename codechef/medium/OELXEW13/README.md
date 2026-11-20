# OELXEW13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Updating Elements

In this example, we demonstrate how to update elements in an array and print them.

 **Output:** 

```
Updated marks:
Student 1: 70
Student 2: 88
Student 3: 90
Student 4: 85
Student 5: 95

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:10:48.848Z  

```java

class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array
        int[] marks = {70, 80, 90, 85, 75};

        // Step 2: Update some elements
        marks[1] = 88;  // Update second element
        marks[4] = 95;  // Update fifth element

        // Step 3: Print all elements without using a loop
        System.out.println("Updated marks:");
        System.out.println("Student 1: " + marks[0]);
        System.out.println("Student 2: " + marks[1]);
        System.out.println("Student 3: " + marks[2]);
        System.out.println("Student 4: " + marks[3]);
        System.out.println("Student 5: " + marks[4]);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OELXEW13)