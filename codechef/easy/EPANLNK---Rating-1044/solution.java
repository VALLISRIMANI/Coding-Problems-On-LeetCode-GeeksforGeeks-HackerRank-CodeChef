import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        while (t-- > 0) {
            String s = scanner.next();
            s = "0" + s;
            s = s.substring(s.length() - 2);
            int n = Integer.parseInt(s);  // Convert to integer
            System.out.println(n % 20);
        }
    }
}
