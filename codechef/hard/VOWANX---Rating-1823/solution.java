import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    
    public static String rearrangeString(String s) {
        int n = s.length();
        char[] t = new char[n];  // Initialize the output array
        int l = 0;
        int r = n - 1;
        boolean start = false;

        for (int i = n - 1; i >= 0; i--) {
            if (start) {
                t[l] = s.charAt(i);
                l++;
            } else {
                t[r] = s.charAt(i);
                r--;
            }
            if (isVowel(s.charAt(i))) {  // Check if the character is a vowel
                start = !start;
            }
        }
        return new String(t);  // Convert char array to string
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;  // Check if the character is a vowel
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());  // First line is the number of test cases
        StringBuilder results = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine());  // Read the length of the string (not used directly)
            String s = scanner.nextLine();  // Read the string
            String result = rearrangeString(s);
            results.append(result).append("\n");
        }
        System.out.print(results.toString());  // Print all results at once

        scanner.close();
    }
}
