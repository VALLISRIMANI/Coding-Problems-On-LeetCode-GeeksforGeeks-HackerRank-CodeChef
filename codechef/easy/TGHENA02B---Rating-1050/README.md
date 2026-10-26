# TGHENA02B - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice - Complete the Event API Controller

 **Scenario :** 
You are building a simple  **Event Management API**  using Spring Boot.

- The EventService and EventRepository layers are already implemented and working.
- The GET and POST endpoints in the EventController are already completed for you.

Your task is to  **complete the `EventController`**  by implementing the remaining CRUD functionality:  **PUT and DELETE**.

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Controller Tasks :** 
You need to implement the following endpoints in EventController:
 **1. Update an event by ID** 

- Method: PUT -URL: /api/events/{id}
- Request Body: JSON with updated event data
- Response:

```
"Event updated successfully!" if ID exists

```

"Event not found!" if ID is invalid

 **2. Delete an event by ID** 

- Method: DELETE
- URL: /api/events/{id}
- Response:

```
"Event deleted successfully!" if ID exists

```

"Event not found!" if ID is invalid

- Delete all events
- Method: DELETE
- URL: /api/events
- Response:

```
"All events deleted successfully!"

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T15:04:23.507Z  

```cpp
        }
        return "Event not found!";
    }


    // 2️ Delete an event by ID
    // Method: DELETE
    // URL: /api/events/{id}
    @DeleteMapping("/{id}")
    public String deleteEvent(@PathVariable int id) {

        // TODO:
        // 1. Check if id is valid
        // 2. Call eventService.deleteEvent(id)
        // 3. Return appropriate message
        if (id >= 0 && id < eventService.getEventCount()) {
            eventService.deleteEvent(id);
            return "Event deleted successfully!";
        }
        return "Event not found!";
    }

```

---

[View on CodeChef](https://www.codechef.com/problems/TGHENA02B)