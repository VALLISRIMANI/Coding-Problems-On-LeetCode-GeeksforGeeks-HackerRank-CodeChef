# TGHENAXY05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Build a Task Manager API (Interface-Based Design)

You are building a Simple Task Manager API.
A task is just a text description (example: "Complete homework").
Your goal is to implement the API using:

```
Controller → Service → Repository

```

and follow  **Interface-Based Design**.

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal :** 
Complete a working Spring Boot API using:

- Service Interface + Implementation
- Repository Interface + Implementation
- Constructor-based Dependency Injection
- In-memory storage (ArrayList)

 **API Requirements** 

 **1. Add Task** 

```
POST /api/tasks

```

 **Request Body:** 

```
Complete homework

```

 **Response:** 

```
Task added successfully!

```

 **2. Get All Tasks** 

```
GET /api/tasks/list

```

 **Response:** 

```
[
  "Complete homework"
]

```

 **Instructions :** 

- Complete the missing code marked with: // TODO
- Use constructor-based dependency injection only
- Do NOT store data in controller
- Follow interface-based design
- Repository handles storage only
- Service handles logic only
- Do not change package names

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T07:06:04.418Z  

```cpp

public interface TaskRepository {

    // TODO: declare method to save a task
    public void add(String task);

    // TODO: declare method to return all tasks
    public List<String> getAll();
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TGHENAXY05)