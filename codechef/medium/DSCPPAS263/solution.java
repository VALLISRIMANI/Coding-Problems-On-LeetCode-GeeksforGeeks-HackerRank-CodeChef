import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Calculate the total number of elements
        int total_elements = n * m;

        // Check if the total number of elements is even
        if (total_elements % 2 != 0) {
            System.out.println(-1);
        } else {
            // Construct the n x m matrix filled with 1s
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}