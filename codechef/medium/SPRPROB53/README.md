# SPRPROB53

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Support Ticket API

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal:** 
The goal of this exercise is to practice creating a POST API using `@RequestBody` in Spring Boot.

 **Your Task:** 
Build a simple Support Ticket application. The application should allow clients (like frontend apps or Postman) to:

- Raise a new support ticket via POST API using @RequestBody to read JSON input.
- Fetch all tickets via GET API (for testing only).

Implement the  **POST API**  that will take a JSON object representing a  **Ticket**, read it using @RequestBody, and store it in an in-memory list.

 **Example JSON for POST request:** 

Select  **POST**  and add the  **JSON request** :

```
{
  "ticketTitle": "Cannot login",
  "description": "I am unable to login to my account"
}

```

 **After adding a ticket, the API should return a confirmation message like** :

```
"Ticket submitted successfully!"

```

 **For Testing** :
After sending your  **POST**  request, you can select  **GET**  and type  **`/tickets`**  in your API tester to check whether your tickets has been added successfully.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T05:25:10.240Z  

```cpp
        // Your code here
    public String addTicket(@RequestBody Ticket ticket) { 
    @PostMapping
    // POST API - raise a new ticket (starter template)

    }
        return ticketList;
    public List<Ticket> getAllTickets() {
    @GetMapping
    // GET API - fetch all tickets

    // In-memory list to store tickets
    private List<Ticket> ticketList = new ArrayList<>();
       ticketList.add(ticket);
       return "Ticket submitted successfully!";
    }
}

// Ticket class to represent the data
class Ticket {
```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB53)