# DCTRHJ30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Flight Status Comparison

Write a program to compare the status of two flights using the `.equals()` method.
The program should store two flight status values, along with the flight number and duration.
Then, it should print the details and check if both flight statuses match.

 **Expected Output:** 

```
Flight Number: 1023  
Flight Duration: 2.5 hours  
Flight status match: false  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T14:06:45.079Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Flight details
        String flightStatus1 = "On Time";
        String flightStatus2 = "Delayed";
        int flightNumber = 1023;
        double flightDuration = 2.5;

        // Comparing flight statuses
        boolean statusMatch = flightStatus1.equals(flightStatus2);

        // Printing flight details and comparison result
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Flight Duration: " + flightDuration + " hours");
        System.out.println("Flight status match: " + statusMatch);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ30)