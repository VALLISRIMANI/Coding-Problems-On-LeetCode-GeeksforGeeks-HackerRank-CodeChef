import java.util.Scanner;

public class Main {
    
    public static boolean searchInMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        
        int start = 0, end = numRows * numCols - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = matrix[mid / numCols][mid % numCols];
            
            if (target == midElement)
                return true;
            else if (target < midElement)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        
        if (n == 0 || m == 0) {
            System.out.println("NO");
            return;
        }
        
        int[][] mat = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = scanner.nextInt();
                mat[i][j] = val;
            }
        }
        
        if (searchInMatrix(mat, x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
