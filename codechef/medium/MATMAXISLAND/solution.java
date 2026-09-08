import java.util.Scanner;

public class Main {
    public static int areaOfIsland(int[][] mat, int i, int j, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m && mat[i][j] == 1) {
            mat[i][j] = 0;
            return 1 + areaOfIsland(mat, i + 1, j, n, m) + areaOfIsland(mat, i - 1, j, n, m)
                   + areaOfIsland(mat, i, j - 1, n, m) + areaOfIsland(mat, i, j + 1, n, m);
        }
        return 0;
    }

    public static int maxAreaOfIsland(int[][] mat, int n, int m) {
        int max_area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    max_area = Math.max(max_area, areaOfIsland(mat, i, j, n, m));
            }
        }
        return max_area;
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

        System.out.println(maxAreaOfIsland(mat, n, m));
    }
}
