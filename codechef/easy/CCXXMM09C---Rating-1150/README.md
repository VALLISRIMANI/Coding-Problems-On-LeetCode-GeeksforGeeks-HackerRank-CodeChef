# CCXXMM09C - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice Problem - Product Manager API

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal :** 
Create a  **Product Manager API**  using Spring Boot and Spring Data JPA.
The application should  **allow users to create, read, update, and delete products**  from the database.
Each Product should contain:

- id (Auto-generated Primary Key)
- name
- price

 **Your Task :** 
Complete the code, given in IDE By following the below Requirements :

 **1. Create Entity** 
Create a class `Product.java` inside the model package.
Fields:

- id
- name
- price

Use the following annotations:

- @Entity
- @Id
- @GeneratedValue

 **2. Create Repository** 
Create `ProductRepository.java` inside the repository package.
Extend:

```
JpaRepository<Product, Long>

```

Do not write any implementation.

 **3. Create Controller** 
Create `ProductController.java` inside the controller package.
Base path:

```
/api/products

```

 **4. Implement APIs** 
Implement the following APIs using built-in repository methods.

 **Example Request (POST)** 

```
POST /api/products

```

Body:

```
{
  "name": "Laptop",
  "price": 75000
}

```

Note :

- Test All the API endpoints properly
- To See Database : Open H2 Console In the lab URL, after codechef-apps.com Add : \

```
/h2-console/login.jsp

```

Login using below details-

```
JDBC URL : jdbc:h2:mem:testdb
Username : sa
Password : (leave empty)

```

Then Run Query : `SELECT * FROM PRODUCT`
& Observe the result in Table `PRODUCT`.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T04:44:58.280Z  

```cpp
        return productRepository.findById(id).orElse(null);
    }

    // Update Product
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {

        Product product = productRepository.findById(id).orElse(null);

        if (product != null) {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());

            return productRepository.save(product);
        }

        return null;
    }

    // Delete Product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
```

---

[View on CodeChef](https://www.codechef.com/problems/CCXXMM09C)