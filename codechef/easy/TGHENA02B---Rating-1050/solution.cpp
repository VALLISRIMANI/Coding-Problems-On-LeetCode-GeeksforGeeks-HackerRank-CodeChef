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
