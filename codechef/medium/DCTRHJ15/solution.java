class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String bookTitle = "Book";
        String authorName = "John Doe";
        int totalPages = 200;
        int membershipNumber = 67890;

        // Print individual details
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Membership Number: " + membershipNumber);

        // Concatenate details into a summary
        String bookSummary = bookTitle + " by " + authorName + " has " + totalPages + " pages. Borrowed by member #" + membershipNumber + ".";
        System.out.println("Library Book Summary: " + bookSummary);
    }
}
