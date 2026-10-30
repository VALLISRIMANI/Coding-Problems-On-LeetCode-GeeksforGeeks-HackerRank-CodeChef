# OOPPUK03 - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice - Product API with Input Validation

You are required to complete the given template code for a Product Management API using Spring Boot that follows given requirements.
This API should allow users to add products and view all products,  **while ensuring that the input data is properly validated**.

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Requirements** 

 **1. Create Product (POST /product)** 
Accept product details in JSON format and store them.
Each product should contain:

- id (integer)
- name (string)
- brand (string)
- supplierEmail (string)

 **2. Validation Rules** 

You must apply the following validations:

- name Must not be null Length must be between 3 and 15 characters
- brand Must not be null Minimum length should be 2 characters
- supplierEmail Must not be null Must be a valid email format

 **3. Validation Behavior** 
If the input is  **valid**  → return  **201 CREATED** 
If any validation  **fails**  → return  **400 BAD REQUEST** 

 **4. Get All Products (GET /products)** 
Return the list of all stored products
Response should have **200 OK*

 **Example Request** 

- Valid Input

```
{
  "id": 1,
  "name": "Laptop",
  "brand": "Dell",
  "supplierEmail": "test@gmail.com"
}

```

Response - 200 CREATED

- Invalid Input (Name too short)

```
{
  "id": 2,
  "name": "LP",
  "brand": "Dell",
  "supplierEmail": "test@gmail.com"
}

```

Response - 400 BAD REQUEST

- Invalid Input (Name too short)

```
{
  "id": 2,
  "name": "LP",
  "brand": "Dell",
  "supplierEmail": "test@gmail.com"
}

```

Response - 400 BAD REQUEST

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T06:08:08.056Z  

```cpp
@RestController


import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import com.example.demo.service.ProductService;

import com.example.demo.model.Product;

package com.example.demo.controller;
public class ProductController {

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPPUK03)