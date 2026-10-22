
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