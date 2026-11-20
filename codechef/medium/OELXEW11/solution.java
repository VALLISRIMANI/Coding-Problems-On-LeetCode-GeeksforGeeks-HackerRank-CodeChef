class Codechef {
    public static void main(String[] args) {
        // Define a string with comma-separated values
        String data = "Red,Green,Blue";

        // Use the split() method to divide the string into an array, using "," as the delimiter
        String[] colors = data.split(","); // Splits string into array

        // Access and print each element of the array manually without using loops
        System.out.println("First color: " + colors[0]); // Prints the first color
        System.out.println("Second color: " + colors[1]); // Prints the second color
        System.out.println("Third color: " + colors[2]); // Prints the third color
    }
}
