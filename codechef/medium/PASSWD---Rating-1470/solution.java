import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isSecurePassword(String s) {
        HashSet<Character> specialChars = new HashSet<>();
        specialChars.add('@');
        specialChars.add('#');
        specialChars.add('%');
        specialChars.add('&');
        specialChars.add('?');
        
        boolean len = s.length() >= 10;
        boolean small = false, large = false, digit = false, spec = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') small = true;
            if (i != 0 && i != s.length() - 1) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') large = true;
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') digit = true;
                if (specialChars.contains(s.charAt(i))) spec = true;
            }
        }

        return len && small && large && digit && spec;
    }

    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // Consume the newline

        for (int i = 0; i < t; i++) {
            String password = sc.nextLine();
            System.out.println(isSecurePassword(password) ? "YES" : "NO");
        }
        sc.close();
    }
}
