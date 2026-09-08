import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    // Complete the below function
     int solve(int[][] mat, int n, int m) {

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Step 1: Count fresh apples & push all rotten apples into queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 2) {
                    q.add(new int[]{i, j});
                }

                if (mat[i][j] == 1)
                    fresh++;
            }
        }

        // If no fresh apples → answer is 0
        if (fresh == 0) return 0;

        int minutes = 0;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        // Step 2: BFS
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottenThisMinute = false;

            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];

                for (int[] d : dirs) {
                    int nx = x + d[0];
                    int ny = y + d[1];

                    // Convert fresh apple to rotten
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && mat[nx][ny] == 1) {
                        mat[nx][ny] = 2;  // make it rotten
                        fresh--;          // reduce fresh count
                        rottenThisMinute = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }

            // Only increase minutes if at least one apple became rotten
            if (rottenThisMinute)
                minutes++;
        }

        // If any fresh apples remain → impossible
        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                mat[i][j] = sc.nextInt();

        // Create object to call non-static solve
        Codechef obj = new Codechef();

        int ans = obj.solve(mat, n, m);

        System.out.println(ans);
    }
}
