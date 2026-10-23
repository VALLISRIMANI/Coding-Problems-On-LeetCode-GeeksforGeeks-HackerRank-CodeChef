# CCIVKU00 - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice Project - Build Book Manager API

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal :** 
Create a simple  **Spring Boot REST API**  that manages books.
You will build APIs that allow users to:

- Add a new book
- View all books
- View a book using its ID

This project helps you understand how basic APIs work in Spring Boot.

 **Project Overview :** 
You are given a partially completed controller class for a Book Manager application.
Some parts of the code are intentionally missing.
Your task is to complete the code so that the API works correctly.
The application will store books in memory using a list (no database required).

 **Book Information** 
Each book should contain:

- id → unique number (generated automatically)
- title → name of the book
- author → author of the book

 **Your Task :** 
Complete the missing parts in the template code by following the instructions written as TODO comments.
You need to:

 **1. Create Storage for Books** 

- Initialize an in-memory list to store books.
- Create a variable that helps generate unique IDs.

 **2. Complete the Book Class** 
Inside the controller, complete the Book class by adding:

- id field
- title field
- author field

 **3. Implement Add Book API** 
Complete the method that:

- Receives book data from request body
- Assigns a unique ID to the book
- Adds the book to the list
- Returns the saved book

 **Endpoint** 

```
POST /api/books

```

 **Example request body:** 

```
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}

```

 **4. Implement Get All Books API** 
Complete the method that:

- Returns all stored books.

 **Endpoint** 

```
GET /api/books

```

 **5. Implement Get Book By ID API** 
Complete the method that:

- Accepts an ID from the URL
- Searches the list for a matching book
- Returns the book if found
- Returns null if not found

 **Endpoint** 

```
GET /api/books/{id}

```

 **Example:** 

```
GET /api/books/1

```

 **Rules :** 

- Do NOT use a database.
- Everything should remain inside one controller.
- Use only an in-memory List.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T05:45:26.208Z  

```cpp

    public static class Book {
    // TODO: Create inner static Book class
    // ---------------- BOOK CLASS ----------------
        // TODO: Add fields
        public int id;
        public String title;
        public String author;

    }

    // ---------------- ADD BOOK ----------------
    // TODO: Create POST mapping to add a new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {

        // TODO: Set book ID using nextId and increment it
        book.id = ++nextId;

        // TODO: Add book to bookList
```

---

[View on CodeChef](https://www.codechef.com/problems/CCIVKU00)