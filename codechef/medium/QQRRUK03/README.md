# QQRRUK03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice - Book Management API with Finder Methods

You are given a partially implemented Spring Boot application for managing books. Your task is to complete the repository layer by implementing storage and finder methods.

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal :** 
Complete the BookRepository class to:

- Store books in memory
- Save new books
- Retrieve all books
- Search books by title
- Search books by author

 **Task Requirements :** 
You need to complete the following methods in BookRepository.java:

 **1. Initialize Storage :** 

- Create an in-memory list to store books
- Use List for storage

 **2. Save Method :** 

- Add the given book to the list
- Return the saved book

 **3. Find All Method** 

- Return all books stored in the list

 **4. Finder Method: `findByTitle` :** 

- Return a list of books whose title matches the given input
- Matching should be case-insensitive

 **5. Finder Method: `findByAuthor` :** 

- Return a list of books whose author matches the given input
- Matching should be case-insensitive

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T03:00:25.249Z  

```cpp

    }
        
        return books;
        // TODO: return all books from storage
    public List<Book> findAll() {
    // Return all books

    }
        return book;
        // return the saved book
        books.add(book);
        // TODO: add book to storage
    public Book save(Book book) {
    // Save a book
    List<Book> books = new ArrayList<>();

    // TODO: Initialize storage (e.g., List<Book>)
```

---

[View on CodeChef](https://www.codechef.com/problems/QQRRUK03)