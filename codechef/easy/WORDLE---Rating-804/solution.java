import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            String tWord = scanner.next();
            
            StringBuilder result = new StringBuilder();
            
            // Compare each of the 5 characters
            for (int i = 0; i < 5; i++) {
                if (s.charAt(i) == tWord.charAt(i)) {
                    result.append('G');
                } else {
                    result.append('B');
                }
            }
            
            // Print the result string M for the current test case
            System.out.println(result.toString());
        }
        
        scanner.close();
    }
}