# MATEQRC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T10:56:17.539Z  

```java
import java.util.Scanner;

public class Main {
    public static int firstOne(int[] row, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || row[mid - 1] == 0) && row[mid] == 1) {
                return mid;
            } else if (row[mid] == 0) {
                return firstOne(row, mid + 1, high);
            } else {
                return firstOne(row, low, mid - 1);
            }
        }
        return -1; 
    }

    public static int maxOneRow(int[][] mat) {
        int maxones = 0;
        int rowIdx = 0;
        for (int i = 0; i < mat.length; i++) {
            int ones = mat[i].length - firstOne(mat[i], 0, mat[i].length - 1);
            if (ones > maxones) {
                maxones = ones;
                rowIdx = i;
            }
        }
        return rowIdx + 1;
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

        System.out.println(maxOneRow(mat));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATEQRC)