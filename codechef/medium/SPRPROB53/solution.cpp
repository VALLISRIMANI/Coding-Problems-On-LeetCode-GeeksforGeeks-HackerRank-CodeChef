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