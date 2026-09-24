import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();
        while (T--> 0) {
            // Read the number of elements
            int n = scanner.nextInt();
            final int INF = (int) 1e9; // Define infinity
            int mn = INF; // Initialize minimum to infinity
            int where = -1; // Initialize position of the minimum element

            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt(); // Read the element
                if (x < mn) { // Check if it's the new minimum
                    mn = x; // Update minimum
                    where = i + 1; // Update position (1-based index)
                }
            }
            System.out.println(where); // Output the position of the minimum
        }

        scanner.close(); // Close the scanner
    }
}