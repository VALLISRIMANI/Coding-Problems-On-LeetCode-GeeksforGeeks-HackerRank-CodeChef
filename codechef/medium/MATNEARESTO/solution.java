import java.util.*;

public class Main {
    static int[] directions = {0, 1, 0, -1, 0};

    public static void updateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                if (matrix[row][col] == 0) {
                    queue.add(new int[]{row, col});
                } else {
                    matrix[row][col] = -1;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0], col = cell[1];

            for (int i = 0; i < 4; ++i) {
                int new_row = row + directions[i], new_col = col + directions[i+1];
                if (new_row >= 0 && new_row < rows && new_col >= 0 && new_col < cols && matrix[new_row][new_col] == -1) {
                    matrix[new_row][new_col] = matrix[row][col] + 1;
                    queue.add(new int[]{new_row, new_col});
                }
            }
        }
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
                assert (mat[i][j] == 0 || mat[i][j] == 1);
            }
        }

        updateMatrix(mat);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
