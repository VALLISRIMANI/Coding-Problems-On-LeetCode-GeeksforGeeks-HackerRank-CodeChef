# SPRPROB35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Todo App (POST API)

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal :** 
The goal of this exercise is to practice creating a  **POST API**  in Spring Boot.

 **Your Task :** 
Build simple Todo application. The application should allow clients (like frontend apps or Postman) to:

- Add a new todo via POST API.
- Fetch all todos via GET API (for testing only).

 **Implement the POST API**  that will take a JSON object representing a Todo and store it in an in-memory list.

 **Example JSON for POST request:** 

Select POST and add JSON request

```
{
  "title": "Buy groceries",
  "completed": false
}

```

After adding a todo, the API should  **return a confirmation message**  like:

```
"Todo added successfully"

```

 **Note:** 
The GET API is already implemented to see all added todos, but your focus is on implementing the POST API.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T10:53:55.128Z  

```cpp

    // POST API - add new todo (starter template)
    public List<Todo> getTodos() {
        return todos;
    }
    // GET API - fetch all todos
    @GetMapping
    private List<Todo> todos = new ArrayList<>();

    // In-memory list to store todos
    @PostMapping
    public String addTodo(@RequestBody Todo todo) {
        // Your code here
        todos.add(todo);
        return "Todo added successfully";
    }
}

// Todo class to represent the data
class Todo {
```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB35)