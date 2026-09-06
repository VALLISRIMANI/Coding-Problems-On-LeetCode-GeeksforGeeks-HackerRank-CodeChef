import java.util.Scanner;

public class Main {
    public static int minPathSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[][] dp = new int[m][n];
        
        dp[0][0] = mat[0][0];
        
        for(int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + mat[i][0];
        }
        
        for(int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + mat[0][j];
        }
        
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + mat[i][j];
            }
        }
        
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        assert (1 <= n && n <= 100);
        assert (1 <= m && m <= 100);

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println(minPathSum(mat));
    }
}
