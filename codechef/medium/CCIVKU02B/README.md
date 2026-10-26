# CCIVKU02B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice - Build a Layered Notes API

 **Scenario :** 

- You are building a Simple Notes API.
- A note is just a text message.
- You are given an empty project structure with all required folders and files already created.
- Your task is to complete the code by following Layered Architecture.

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal** 
Implement a working Spring Boot API using:

```
Controller → Service → Repository

```

 **API Requirements** 
Endpoints to Implement

- POST /api/notes → Add a note
- GET /api/notes/list → Get all notes

 **Instructions :** 

- Open the project files:
- NoteController.java
- NoteService.java
- NoteRepository.java
- Complete the code :
- Complete the missing parts (marked with // TODO) in each file.
- Rules to follow:
- Use constructor-based dependency injection only
- Do not store data in the controller
- Use an in-memory List for storage (no database)
- Each layer must have only its own responsibility
- Do not change the given package names or class names

 **Expected Output :** 

- POST /api/notes – Add a note : "Buy groceries"
- Output :

```
Note added successfully!

```

- GET /api/notes/list – Get all notes
- Output

```
[
  "Buy groceries"
]

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T06:35:10.874Z  

```cpp
    public void save(String note) {
        // TODO: Add note to list
        notes.add(note);
    }

    public List<String> findAll() {
        // TODO: Return all notes
        return notes;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CCIVKU02B)