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