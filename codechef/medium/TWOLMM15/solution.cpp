            // Handling file-related exceptions
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        String filePath = "cities.txt";  // File path to be read
        readFile(filePath);  // Calling the readFile method
    }
}
