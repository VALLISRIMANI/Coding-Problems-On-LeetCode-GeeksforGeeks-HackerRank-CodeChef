# SPRPROB44

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Use PathVariable

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal :**  Understand how to use `@PathVariable` to fetch data based on values passed in the URL.

 **Available Endpoints** 
The following endpoints are already present in the application:

- Get all products

```
GET /api/products

```

This API is already completed and working.

- Get product by ID

```
GET /api/products/{id}

```

This API is incomplete and needs to be implemented.

 **Your Task :** 

- Complete the API that fetches a product by ID using @PathVariable.
- The API should return the correct product when a valid ID is provided.
- It should return "Product not found" when the ID is invalid.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T04:43:24.561Z  

```cpp
    // Get all products
    @GetMapping
    public List<String> getAllProducts() {
        return products;
    }

    // Get product by ID
    @GetMapping("/{id}")
    }

        products.add("Headphones");
        products.add("Mobile");
        products.add("Laptop");
    public ProductController() {
    // Constructor to add demo products

    // In-memory list of demo products
    private List<String> products = new ArrayList<>();

public class ProductController {
@RequestMapping("/api/products")
```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB44)