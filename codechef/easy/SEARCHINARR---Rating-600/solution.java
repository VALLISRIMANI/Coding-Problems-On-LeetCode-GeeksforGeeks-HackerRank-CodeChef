public static String solve(int N, int X, int[] A) {
    for (int num : A) {
        if (num == X) {
            return "YES";
        }
    }
    
    return "NO";
}