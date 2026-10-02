
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            ArrayList<Integer> distinctElements = new ArrayList<>();
            int prev = -1;
            
            for (int i = 0; i < N; i++) {
                int current = Integer.parseInt(st.nextToken());
                if (current != prev) {
                    distinctElements.add(current);
                    prev = current;
                }
            }
            
            System.out.println(distinctElements.size());
            for (int i = 0; i < distinctElements.size(); i++) {
                System.out.print(distinctElements.get(i));
                if (i < distinctElements.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
