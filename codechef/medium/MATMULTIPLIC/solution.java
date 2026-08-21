import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] a = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        int _n = n;

        n = scanner.nextInt();
        int p = scanner.nextInt();

        assert (_n == n);

        int[][] b = new int[n][p];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++){
                b[i][j] = scanner.nextInt();
            }
        }

        int[][] mul = new int[m][p];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < p; j++){
                mul[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
