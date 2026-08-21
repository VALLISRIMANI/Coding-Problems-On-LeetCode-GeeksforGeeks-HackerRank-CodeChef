import java.util.Scanner;

public class Main {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - i - 1) {
                sum += mat[i][i] + mat[i][n - i - 1];
            } else {
                sum += mat[i][i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println(diagonalSum(mat));
    }
}
