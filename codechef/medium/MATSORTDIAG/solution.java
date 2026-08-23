import java.util.Scanner;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static int[][] diagonalSort(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        HashMap<Integer, PriorityQueue<Integer>> d = new HashMap<>();
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int key = i - j;
                if (!d.containsKey(key)) {
                    d.put(key, new PriorityQueue<>());
                }
                d.get(key).offer(mat[i][j]);
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int key = i - j;
                mat[i][j] = d.get(key).poll();
            }
        }
        
        return mat;
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

        mat = diagonalSort(mat);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
