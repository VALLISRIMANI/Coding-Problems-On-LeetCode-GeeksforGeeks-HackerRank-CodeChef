import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        
        while (T-- > 0) {
            String[] nk = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]) % n;
            
            String[] pearls = br.readLine().trim().split("\\s+");
            Queue<Integer> q = new LinkedList<>();
            
            for (int i = 0; i < n; i++) {
                q.offer(Integer.parseInt(pearls[i]));
            }
            
            // Rotate the queue left by k positions
            for (int i = 0; i < k; i++) {
                q.offer(q.poll());
            }
            
            while (!q.isEmpty()) {
                sb.append(q.poll()).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}