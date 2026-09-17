import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String x = scanner.next();
            String y = scanner.next();

            boolean match = true;
            
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) != '?' && y.charAt(j) != '?' && x.charAt(j) != y.charAt(j)) {
                    match = false;
                    break;
                }
            }
            
            System.out.println(match ? "Yes" : "No");
        }
    }
}
