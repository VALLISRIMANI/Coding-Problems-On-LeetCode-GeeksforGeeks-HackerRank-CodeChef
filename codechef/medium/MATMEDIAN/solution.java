import java.util.Scanner;

public class Main {
    
    public static int countElementsSmallerThanMid(int[] row, int midValue) {
        int lowIndex = 0, highIndex = row.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            if (row[middleIndex] <= midValue) {
                lowIndex = middleIndex + 1;
            } else {
                highIndex = middleIndex - 1;
            }
        }
        return lowIndex;
    }

    public static int findMedianValue(int[][] matrix) {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        
        int lowValue = Integer.MAX_VALUE;
        int highValue = Integer.MIN_VALUE;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                lowValue = Math.min(lowValue, matrix[i][j]);
                highValue = Math.max(highValue, matrix[i][j]);
            }
        }

        while (lowValue <= highValue) {
            int midValue = (lowValue + highValue) / 2;
            int count = 0;
            for (int i = 0; i < rowCount; i++) {
                count += countElementsSmallerThanMid(matrix[i], midValue);
            }
            if (count <= (rowCount * columnCount) / 2) {
                lowValue = midValue + 1;
            } else {
                highValue = midValue - 1;
            }
        }
        return lowValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println(findMedianValue(mat));

        sc.close();
    }
}
