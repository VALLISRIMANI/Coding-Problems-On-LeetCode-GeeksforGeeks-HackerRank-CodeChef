import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int equalPairs(int[][] mat) {
        int ans = 0;
        HashMap<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < mat[i].length; j++) {
                sb.append(mat[i][j]);
                sb.append(",");
            }
            mp.put(sb.toString(), mp.getOrDefault(sb.toString(), 0) + 1);
        }

        for (int i = 0; i < mat[0].length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < mat.length; j++) {
                sb.append(mat[j][i]);
                sb.append(",");
            }
            ans += mp.getOrDefault(sb.toString(), 0);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        assert (1 <= n && n <= 100);

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println(equalPairs(mat));
    }
}
