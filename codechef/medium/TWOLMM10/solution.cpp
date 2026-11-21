import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

class Codechef {
    // Method to read and return file content as a String
    public static String readFile(String filepath) {
        try {
            // Read the entire file as a string
            String content = Files.readString(Paths.get(filepath));

            return content;  // Return file content
        } catch (IOException e) {
            return "Error reading file: " + e.getMessage();  // Handle file read errors
        }
    }