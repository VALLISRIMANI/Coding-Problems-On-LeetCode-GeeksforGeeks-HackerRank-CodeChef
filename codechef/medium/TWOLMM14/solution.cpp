public class Codechef {
    public static void main(String[] args) {
        try {
            // Read all lines from the file and store them in an ArrayList
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("usernames.txt")));

            // Print each line using a traditional for loop
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
