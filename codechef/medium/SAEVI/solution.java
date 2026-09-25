import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long threshold = 2 * K;

        long totalSum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long val = Long.parseLong(st.nextToken());
            if (i % 2 == 0 && val > threshold) {
                totalSum += val;
            }
        }

        System.out.println(totalSum);
    }
}