public static void findPeaks(int[] A, int n) {
    boolean hasPeak = false;

    for (int i = 0; i < n; i++) {
        if ((i == 0 || A[i] > A[i - 1]) && (i == n - 1 || A[i] > A[i + 1])) {
            System.out.print(A[i] + " ");
            hasPeak = true;
        }
    }

    if (!hasPeak) {
        System.out.print("-1");
    }
}