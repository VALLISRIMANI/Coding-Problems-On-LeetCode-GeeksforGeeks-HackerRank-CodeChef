# SPRB02 - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### URL Shortener Project

 **Hey Learners!**  Welcome to the  **URL Shortener Project**  🔗🚀

In this project, you will build a  **backend REST API**  using Spring Boot that converts long, messy URLs into short, clean, and shareable links.

Sharing long web addresses can be cumbersome. Chef needs a high-performance, lightweight service where users can shorten URLs and, when they click the short link, be instantly redirected to the original website.

Your  **task**  is to  **complete the missing logic**  and make the API fully functional.

 **Project Structure** 
You are given  **4 Java files**  representing a  **Layered Architecture** :

- UrlRequest.java → Model class (Data Transfer Object).
- UrlRepository.java → Repository layer (In-memory storage using HashMap).
- UrlService.java → Service layer (Business logic & Hashing).
- UrlController.java → REST Controller (API Endpoints).

 **Important Rules** 

- Do NOT change class names
- Do NOT change method names
- Complete the sections marked with TODO
- The testing system relies on the existing structure
- In-Memory Storage: Data is stored in a HashMap. Data is lost when the application restarts (this is expected behavior).

 **Data Structure** 
You will be working with two primary structures in this project:

- The Request Object (Input):
- originalUrl (String) - The long URL provided by the user that needs to be shortened (e.g., https://www.codechef.com/).
- The Storage Map (Internal Memory):
- Key (String): The generated shortCode (e.g., "5d4140").
- Value (String): The originalUrl associated with that code.
- Note: This Map acts as your temporary database.

 **Your Task:** 

- Complete the Model File: model/UrlRequest.java This class is the "envelope" that holds the data sent by the user. Constructor: Complete the Parameterized Constructor. Assign the passed variable (originalUrl) to the class field. Encapsulation: Implement the missing Getters and Setters so other classes can access and modify the private data. Docs: How JSON Maps to Java Objects
- Build the Repository (The Database Layer) File: repository/UrlRepository.java This class manages the raw data in a HashMap. Annotation: Add the correct Spring annotation to mark this class as a Repository. saveUrl Method: Store the mapping in the urlStore map. Use the shortCode as the Key and originalUrl as the Value. getOriginalUrl Method: Retrieve the original url from the map using the shortCode. exists Method: Return true if the map contains the shortCode, otherwise return false. getAllUrls Method: Return the entire map. Docs: @Repository Annotation | Java HashMap | Java Map Interface (put, get, containsKey)
- Connect the Service (The Logic Layer) File: service/UrlService.java This class handles the logic, specifically generating the unique hash. Annotation: Add the correct Spring annotation to mark this class as a Service. Constructor Injection: Initialize the urlRepository variable inside the constructor. shortenUrl Method: Hashing: We use MD5 to generate a unique code. Use DigestUtils.md5DigestAsHex on the original URL bytes (Code provided). MD5 (Message-Digest Algorithm 5) is a cryptographic hash function that converts any input (like a long URL) into a fixed-length 32-character hexadecimal string. Hashing is one-way, meaning you can’t reverse it to get the original URL - perfect for generating unique, consistent codes. In this project, we use Spring’s built-in DigestUtils class to create an MD5 hash of the long URL and then take the first 6 characters of that hash as the shortCode. Substring: Extract the first 6 characters of the generated hash to create the shortCode. Logic: Check if the code already exists in the repository. If it does NOT, save the new mapping. Return: Return the generated shortCode. getOriginalUrl Method: Call the repository to fetch the URL. Docs: Spring Constructor Injection | @Service Annotation | MD5 Hashing in Java | Java substring() Method
- Define the API Endpoints (The Controller Layer) File: controller/UrlController.java This class talks to the outside world (Frontend/Postman).
- Constructor: Inject the UrlService into the controller.
- Endpoint 1: Create Short URL Goal: Receive a long URL and return a short code. Annotation: Use @PostMapping and map it to "/api/shorten". Input: The method should accept a @RequestBody of type UrlRequest (code provided). Logic: Extract the original URL from the request object. Call urlService.shortenUrl(...) to generate the code. Response: Wrap the result in a ResponseEntity (code provided). Return a JSON Map where the key is "shortCode" and the value is the code you generated. Example Output JSON: { "shortCode": "5d4140" }
- Endpoint 2: Redirect to Original URL Goal: When a user visits the short link, redirect them to the real website. Annotation: Use @GetMapping and map it to "/{shortCode}". Input: Use @PathVariable to capture the shortCode from the URL. Logic: Call urlService.getOriginalUrl(...) to find the long URL. Check: If the URL is null (not found), return a 404 Not Found status (code provided). Success: If found, return an HTTP 302 (Found) status. Important: You must set the Location Header of the response to the original URL so the browser knows where to go. Docs: @RestController Annotation | @RequestBody Annotation | @PathVariable Annotation | Building a RESTful Web Service | HTTP 302 Found (Redirect) | HTTP 404 Not Found

 **Expected Behaviour:** 
Since our CodeChef domain itself is a little long, the generated short URLs you see here may also appear slightly longer than typical short URLs.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T05:04:59.599Z  

```cpp
        if (originalUrl == null) {
            // If URL not found, return 404 Not Found
            return ResponseEntity.notFound().build();
        }

        // TODO: Create a Redirect Response (HTTP 302)
        // Hint: Use URI.create() to convert the string URL to a URI object
        return ResponseEntity.status(302)
                .location(URI.create(originalUrl))
                .build();
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/SPRB02)