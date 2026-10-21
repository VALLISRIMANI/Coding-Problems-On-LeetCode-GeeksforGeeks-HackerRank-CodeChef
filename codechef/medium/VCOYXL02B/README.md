# VCOYXL02B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Working of first springboot application
- Let's see the working of first springboot application.

 **How to Run the App** 

You have two options to run the project:

- Click the “Run” button (in your editor or provided interface)
- Or open the terminal and run:

```
cd ~/workspace/demo
mvn spring-boot:run

```

This will launch the application and you'll see  **“Hello, From Spring Boot!”**.

 **How the Code Works :** 

- The application starts from the main() method in DemoApplication.java.
- Spring Boot automatically starts a web server in the background.
- While starting, Spring scans the project and finds HelloController.
- @GetMapping("/") tells Spring which method should run when a request comes in.
- Spring calls the home() method.
- The method returns a text message.
- Spring sends this text back as the response.

That’s how  **“Hello, From Spring Boot!”**  appears in the browser.

 **Quick Note About Project Setup** 

- Normally, you can go to https://start.spring.io to create a Spring Boot project from scratch. But for this problem, we’ve already created and given you a basic Spring Boot starter project, which:
- Is configured with Spring Web dependency
- Has all the folder structure ready
- Includes a pre-written controller for you to explore

This is the magic of Spring Boot:  **easy startup with minimal configuration.**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T08:32:44.301Z  

```cpp
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/") // handles GET request to root URL
    public String home() {
        return "Hello, From Spring Boot!";
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VCOYXL02B)