import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] I = new int[N];
        int maxI = 2;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            I[i] = Integer.parseInt(st.nextToken());
            if (I[i] > maxI) maxI = I[i];
        }

        // 1. Precompute Fibonacci numbers
        int[] F = new int[maxI + 1];
        F[1] = 1;
        if (maxI >= 2) F[2] = 1;
        for (int i = 3; i <= maxI; i++) {
            int val = F[i - 1] + F[i - 2];
            if (val >= MOD) val -= MOD;
            F[i] = val;
        }

        // 2. Build Prefix Sums
        int[] P = new int[N + 1];
        for (int i = 0; i < N; i++) {
            int val = P[i] + F[I[i]];
            if (val >= MOD) val -= MOD;
            P[i + 1] = val;
        }

        // 3. Answer queries
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int ans = P[R] - P[L - 1];
            if (ans < 0) ans += MOD;
            sb.append(ans).append("\n");
        }

        System.out.print(sb.toString());
    }
}