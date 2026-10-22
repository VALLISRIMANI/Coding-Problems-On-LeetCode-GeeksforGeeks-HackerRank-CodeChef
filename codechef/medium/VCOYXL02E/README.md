# VCOYXL02E

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Display your first springboot message - Practice

So far, you have learned:

- How a Spring Boot project is structured
- How to run a Spring Boot app
- How a simple “Hello” app works in the browser
- What @SpringBootApplication does

 **In this practice exercise, you will display "This is my first springboot application" on browser.** 

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal :** 
Complete the controller code i.e (`HelloController.java`),
so that your Spring Boot application  **returns a message in the browser - This is my first springboot application** 

 **Expected Output :**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T06:56:30.661Z  

```cpp
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "This is my first springboot application";
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VCOYXL02E)