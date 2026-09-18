import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        if (S == null) return;
        S = S.trim();
        int N = S.length();
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < N) {
            if (i + 1 < N && S.charAt(i + 1) == '#') {
                int code = S.charAt(i);
                int decoded = 122 - (code - 111);
                sb.append((char)decoded);
                i += 2;
            } else {
                int code = S.charAt(i);
                int decoded = 110 - (code - 97);
                sb.append((char)decoded);
                i += 1;
            }
        }
        System.out.println(sb.toString());
    }
}