# SPRB05 - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Corporate Asset Registry Project

 **Hey Learners!**  Welcome to the  **Corporate Asset Registry Project!**  🏢💻

In this project, you will build a  **Spring Boot Backend**  that acts as a digital ledger for a modern company. It allows the company to track, organize, and manage their physical assets like laptops and vehicles.

 **Efficient management is key!**  Chef needs a reliable system to know exactly what equipment they own, how much it cost, and who is currently using it. Your system will use  **Spring Data JPA**  to talk to a database automatically without writing raw SQL.

Your  **task**  is to  **complete the missing backend logic**  to make this API fully functional.

 **Project Structure** 
You are given  **4 Java files**  representing a  **Layered Architecture** :

- Asset.java → Entity: (The Data Model) that maps a Java class to a Database Table.
- AssetRepository.java → Repository (The Data Access Layer) that handles saving and retrieving data.
- AssetService.java → Service (The Business Logic) that controls the flow of data.
- AssetController.java → Controller (The API Layer) that handles web requests from the frontend.

 **Project Dependencies** 
To build this backend, your project is pre-configured with the following tools:

- Spring Web: For building RESTful API endpoints and handling HTTP requests.
- Spring Data JPA: For interacting with the database using Java objects instead of SQL.
- H2 Database: An in-memory database that stores your data while the app is running.
- Lombok: A library that automatically generates boilerplate code like Getters, Setters, and Constructors.

 **Important Rules** 

- Do NOT change class names
- Do NOT change method names
- Complete the sections marked with TODO
- The testing system relies on the existing structure

 **The Logic: CRUD & JPA** 
This project uses the  **CRUD**  pattern (Create, Read, Update, Delete). Instead of writing complex SQL queries, we use  **Spring Data JPA**.

- Entity: You define a Java class, and Spring creates the table for you.
- Repository: You extend an interface, and Spring generates the code to save(), delete(), or findAll().
- Derived Queries: You can even invent new searches just by naming methods correctly, like findByBirthDate() or findByCategory().

 **Database Access (H2 Console)** 
If you want to visually check your tables and run SQL queries manually:

- Run the file named consoleViewer.js and paste the CodeChef browser URL. For more details, refer to the project demonstration video.
- Command to run the file: node consoleViewer.js
- Copy the URL printed in the output.
- Paste it into your browser to access the H2 Console.
- Write this JDBC URL "jdbc:h2:mem:assetdb" and click Connect to see your live data tables (for more details, check application.properties file).

 **Your Task:** 

- Complete the Entity File: entity/Asset.java This class represents a single item in our database. Annotations: Mark the class as a JPA entity and map it to a table named "corporate_assets". Primary Key: Configure the id field to be the Primary Key and set it to Auto-Increment using the IDENTITY strategy. Constructors: Implement the Default Constructor (required by JPA) and the Parameterized Constructor to initialize fields. Getters & Setters: Generate these for all fields (manually or using Lombok annotations) so other classes can access the data. Docs: Anatomy of a Java Class | Guide to JPA Entities | Lombok @Getter & @Setter | @Id and @GeneratedValue
- Configure the Repository File: repository/AssetRepository.java This interface is your direct line to the database. Annotation: Add the correct Spring annotation to mark this class as a Repository. Inheritance: Make this interface extend JpaRepository. You must specify the Entity type (Asset) and the ID type (Long). Derived Query: Write a method signature that tells Spring to select assets based on their category. Hint: The method name must start with findBy.... Docs: @Repository Annotation | Spring Data Derived Queries | JpaRepository Interface
- Build the Service (The Brain) File: service/AssetService.java This is where the logic lives. It sits between the Controller and the Repository.
- Annotation: Add the correct Spring annotation to mark this class as a Service.
- Dependency Injection: Define a final variable for the Repository and initialize it using a Constructor.
- Implement Methods: Implement the logic for adding and viewing assets by directly calling the repository's built-in save(), findAll(), and findById() methods. Implement the category search by calling the custom method you defined in the Repository. Update: First, find the asset by ID. If it exists, update its fields and save it again. If not, return null. Delete: Check if the asset exists. If yes, delete it and return a success message. If not, return a Not Found message. Docs: @Service Annotation | Constructor Dependency Injection | Spring Data save() Method
- Define the API Endpoints (The Controller) File: controller/AssetController.java This class listens for web requests (JSON) from the frontend. Class Configuration: Annotate the class to make it a REST Controller and define the base URL path as "/api". Dependency Injection: Initialize the AssetService using the constructor. Map the Endpoints: Add Asset (/add): Create an endpoint to handle creation requests. You need to map the incoming JSON body to your Asset object. Get All (/all): Create an endpoint that retrieves and returns the complete list of assets. Get by ID (/{id}): Create an endpoint to find a single asset. You must extract the dynamic ID directly from the URL path. Get by Category (/category/{category}): Create an endpoint to filter assets. Like the ID, you need to extract the category name from the URL. Update Asset (/update/{id}): Create an endpoint to modify an asset. This method requires capturing two pieces of data: the ID from the URL and the updated asset details from the request body. Delete Asset (/delete/{id}): Create an endpoint to remove an asset. Capture the ID from the URL to tell the service which item to delete. Docs: @RestController Annotation | Building a RESTful Web Service | @GetMapping & @PostMapping | Spring @PathVariable | @RequestBody Annotation

 **Expected Behaviour:** 
Before submitting the project, ensure the  **backend server is running**. If you make any changes to the code, you must  **restart the server**  for those changes to take effect.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T05:44:48.354Z  

```cpp
            assetToUpdate.setAssignedTo(assetDetails.getAssignedTo());

            return assetRepository.save(assetToUpdate);
        }
        
        return null;
    }

    // 6. DELETE: Remove an asset
    public String deleteAsset(Long id) {

        // TODO: Check if the asset exists
        if (assetRepository.findById(id).isPresent()) {
            // TODO: If yes: Delete it and return a success message
            assetToUpdate.setPurchaseValue(assetDetails.getPurchaseValue());
            assetToUpdate.setCategory(assetDetails.getCategory());
            assetToUpdate.setAssetName(assetDetails.getAssetName());
            Asset assetToUpdate = existing.get();
        if (existing.isPresent()) {
            assetRepository.deleteById(id);
            return "Asset with ID " + id + " has been successfully deleted.";
        } else {
            // TODO: If no: Return a "Not Found" message
            return "Asset with ID " + id + " not found.";
```

---

[View on CodeChef](https://www.codechef.com/problems/SPRB05)