import java.util.Scanner;

public class Main {
    public static int maximalSquare(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int maxside = 0;
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || mat[i][j] == 0) {
                    dp[i][j] = mat[i][j];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
                
                maxside = Math.max(maxside, dp[i][j]);
            }
        }
        
        return maxside * maxside;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        assert (1 <= n && n <= 100);

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
                assert (mat[i][j] == 0 || mat[i][j] == 1);
            }
        }

        System.out.println(maximalSquare(mat));
    }
}
