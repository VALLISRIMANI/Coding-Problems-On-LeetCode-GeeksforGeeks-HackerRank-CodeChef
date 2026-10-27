# SPRB01 - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Note Taking API Project

 **Hello Developers!**  Welcome to the  **Note-Taking API Project**  📝🚀

In this project, you will build a  **backend REST API**  using  **Spring Boot**  that allows users to manage personal notes.
Modern backend systems are built using clean architecture, where responsibilities are clearly separated.
This project is designed to help you understand how a real backend application works internally-from handling HTTP requests to managing data in memory.

Chef wants a lightweight backend service where users can:

- Create notes
- View all notes
- Update existing notes
- Delete notes

Your task is to complete the missing logic and make the API fully functional.

 **Project Structure** 
You are given 4 Java files representing a  **Layered Architecture** :

- Note.java → Model class
- NoteController.java → REST Controller
- NoteService.java → Service layer
- NoteRepository.java → Repository layer (in-memory storage)

 **Important Rules** 

- Do NOT change class names
- Do NOT change method names
- Complete the sections marked with TODO
- The testing system relies on the existing structure
- In-Memory Storage: Data is lost when the application restarts (this is expected behaviour for this project).

 **Data Structure** 
You will be working with a  **Note**  object that has the following structure:

- id (Long) - Unique ID generated automatically (e.g., 1, 2, 3...).
- title (String) - The header of the note (e.g., "Grocery List").
- content (String) - The body of the note (e.g., "Milk, Eggs, Bread").

 **Your Task:** 

- Complete the Model File: model/Note.java This class is the blueprint for our data.
- Constructor: Complete the Parameterized Constructor. Assign the passed variables (id, title, content) to the class fields.
- Encapsulation: Implement the missing Getters and Setters so other classes can access and modify the private data. Docs: Building a RESTful Web Service
- Build the Repository (The Database Layer) File: repository/NoteRepository.java This class manages the raw data in an ArrayList.
- Annotation: Add the correct Spring annotation to mark this class as a Repository.
- Save Method: Assign a unique ID to the note using the idCounter. Increment the idCounter (e.g., idCounter++) so the next note gets a new number. Add the note to the noteList.
- findAll Method: Return a new ArrayList containing the noteList (this creates a safe copy).
- Update Method: Loop through the list to find the note with the matching id. If found, update its title and content using setters.
- Delete Method: Remove the note from the noteList if its ID matches the provided ID. Docs: @Repository Annotation | Classpath Scanning (Component detection)
- Connect the Service (The Logic Layer) File: service/NoteService.java This class acts as a bridge between the API (Controller) and the Data (Repository).
- Annotation: Add the correct Spring annotation to mark this class as a Service component.
- Constructor Injection: Initialize the noteRepository variable inside the constructor.
- Delegation: Complete the methods (createNote, getAllNotes, updateNote, deleteNote) by simply calling the corresponding methods in the noteRepository. Hint: When creating a note, pass null as the ID (the repository handles ID generation). Docs: Constructor Injection | @Service Annotation
- Define the API Endpoints (The Controller Layer) File: controller/NoteController.java This class talks to the outside world (Frontend/Postman).
- Class Configuration: Ensure this class is recognized as a REST Controller.
- Constructor: Inject the NoteService.
- Map the Endpoints: Add the correct Spring Boot annotations to the methods: Create Note $\rightarrow$ @PostMapping Get Notes $\rightarrow$ @GetMapping Update Note $\rightarrow$ @PutMapping("/{id}") Delete Note $\rightarrow$ @DeleteMapping("/{id}")
- Call the Service: Inside each method, call the matching method from noteService and return the result. Docs: @RestController Annotation | @RequestBody Annotation | @PathVariable Annotation

 **Expected Behaviour:**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T04:41:06.970Z  

```cpp
    }


    // 3. GET ALL NOTES (GET)
    // TODO: Add the correct annotation to handle HTTP GET requests
    @GetMapping
    public List<Note> getAllNotes() {
        // TODO: Call the service to get the list of all notes
        return noteService.getAllNotes();
    }


    // 4. UPDATE A NOTE (PUT)
    // TODO: Add the annotation to map PUT requests with an {id} parameter
```

---

[View on CodeChef](https://www.codechef.com/problems/SPRB01)