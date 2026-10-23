
    public static class Book {
    // TODO: Create inner static Book class
    // ---------------- BOOK CLASS ----------------
        // TODO: Add fields
        public int id;
        public String title;
        public String author;

    }

    // ---------------- ADD BOOK ----------------
    // TODO: Create POST mapping to add a new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {

        // TODO: Set book ID using nextId and increment it
        book.id = ++nextId;

        // TODO: Add book to bookList