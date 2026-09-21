
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(input[i]);
            }
            
            int[] result = findPreviousSmaller(A);
            
            StringBuilder sb = new StringBuilder();
            for (int num : result) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
    
    private static int[] findPreviousSmaller(int[] A) {
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = A[stack.peek()];
            }
            
            stack.push(i);
        }
        
        return result;
    }
}
