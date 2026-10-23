# SPRPROB48

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Text Case Converter API

You are building a Text Case Converter API using Spring Boot.
This API allows the user to  **enter an API URL**  and sends a  **GET**  request to the backend.

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Your Task :** 
Create a Spring Boot controller that:

- Accepts text input from the URL query parameter
- Uses @RequestParam to read the input
- Converts the text to uppercase or lowercase
- Returns the converted text as the response.

 **API Requirements** 

You must create two  **GET API endpoints** :

- Convert text to uppercase

```
GET /api/text/uppercase?text=value

```

- Convert text to lowercase

```
GET /api/text/lowercase?text=value

```

 **Each API should** :

- Accept the input using @RequestParam
- Read the value from the query parameter named text
- Return the converted text as the response

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T05:03:10.987Z  

```cpp
@RestController
@RequestMapping("/api/text")
public class TextController {

    // Convert text to uppercase
    @GetMapping("/uppercase")
    public String convertToUppercase(@RequestParam String text) {

        // Write your code here
        return text.toUpperCase();
    }

    // Convert text to lowercase
    @GetMapping("/lowercase")
    public String convertToLowercase(@RequestParam String text) {

        // Write your code here
        return text.toLowerCase();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB48)