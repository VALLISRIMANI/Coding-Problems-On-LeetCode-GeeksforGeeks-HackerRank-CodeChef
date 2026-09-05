 public static void setZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean firstColZero = false;  // track if first column needs zero

        // First pass: mark rows and columns
        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 0) firstColZero = true;
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;  // mark row
                    mat[0][j] = 0;  // mark column
                }
            }
        }

        // Second pass: set zeros using marks
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
            if (firstColZero) {
                mat[i][0] = 0;
            }
        }
    }