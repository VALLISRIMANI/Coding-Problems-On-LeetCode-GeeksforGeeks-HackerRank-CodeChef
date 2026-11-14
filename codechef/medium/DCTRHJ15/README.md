# DCTRHJ15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Library Book Details

Write a program that concatenates library book details, including the book title, author, and the total number of pages, using the `+` operator. The program should also display the library membership number of the user.

```
bookTitle = "Book";  
authorName = "John Doe";  
totalPages = 200;  
membershipNumber = 67890;  

```

 **Expected Output:** 

```
Book Title: Book  
Author: John Doe  
Total Pages: 200  
Membership Number: 67890  
Library Book Summary: Book by John Doe has 200 pages. Borrowed by member #67890.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T15:22:39.163Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String bookTitle = "Book";
        String authorName = "John Doe";
        int totalPages = 200;
        int membershipNumber = 67890;

        // Print individual details
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Membership Number: " + membershipNumber);

        // Concatenate details into a summary
        String bookSummary = bookTitle + " by " + authorName + " has " + totalPages + " pages. Borrowed by member #" + membershipNumber + ".";
        System.out.println("Library Book Summary: " + bookSummary);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ15)