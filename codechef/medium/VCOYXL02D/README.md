# VCOYXL02D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Using RequestParam for input

 **Step 1: Run the Application** 
Click on  **"Run"**  to Start your Spring Boot application
Once the app is running successfully, the API Tester page will open automatically in your browser

 **Step 2: Test “Add Numbers” API** 
In the URL input field, type:

```
/api/calc/add?a=10&b=5

```

Click the `Send` button

 **What happens:** 

- The request is sent to the backend
- The values a=10 and b=5 are passed as query parameters
- @RequestParam captures both values
- The addition result is returned

 **Step 3: Test “Subtract Numbers” API** 
In the URL input field, type:

```
/api/calc/subtract?a=10&b=5

```

Click the `Send` button

 **What happens:** 

- The values are taken from the query parameters
- @RequestParam reads a and b
- The subtraction result is returned

 **Step 4: Test “Multiply Numbers” API** 
In the URL input field, type:

```
/api/calc/multiply?a=10&b=5

```

Click the `Send` button

 **What happens:** 

- The request includes query parameters
- @RequestParam extracts both values
- The multiplication result is returned

 **Step 5: Test “Divide Numbers” API** 
In the URL input field, type:

```
/api/calc/divide?a=10&b=2

```

Click the `Send` button

 **What happens:** 

- a and b are passed as query parameters
- @RequestParam captures the values
- The division result is returned

 **Step 6: Test Division by Zero** 
In the URL input field, type:

```
/api/calc/divide?a=10&b=0

```

Click the `Send` button

 **What happens:** 

- @RequestParam captures the values
- The controller checks for division by zero
- An error message is returned

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T04:52:46.862Z  

```cpp

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Error: Division by zero is not allowed";
        }
        return String.valueOf(a / b);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VCOYXL02D)