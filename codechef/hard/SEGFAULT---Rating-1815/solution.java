import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] L = new int[n + 1];
            int[] R = new int[n + 1];
            int[] diff = new int[n + 2];

            for (int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                L[i] = Integer.parseInt(st.nextToken());
                R[i] = Integer.parseInt(st.nextToken());

                diff[L[i]]++;
                diff[R[i] + 1]--;
            }

            ArrayList<Integer> ans = new ArrayList<>();

            int count = 0;

            for (int x = 1; x <= n; x++) {
                count += diff[x];

                if (count == n - 1 &&
                    !(L[x] <= x && x <= R[x])) {
                    ans.add(x);
                }
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.println(x);
            }
        }
    }
}