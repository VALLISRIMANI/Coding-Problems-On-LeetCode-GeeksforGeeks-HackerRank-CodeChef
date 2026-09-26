import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                int value = sc.nextInt();  
                q.offer(value);
            }
            
            for (int i = 0; i < K; i++) {
                q.offer(q.poll());
            }
            
            while (!q.isEmpty()) {
                System.out.print(q.poll() + " ");
            }
            
            System.out.println();
        }
        
        sc.close();
	}
}
