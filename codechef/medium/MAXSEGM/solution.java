import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            
            int[] C = new int[N];
            for (int i = 0; i < N; i++) {
                C[i] = Integer.parseInt(st1.nextToken());
            }
            
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] W = new int[N];
            for (int i = 0; i < N; i++) {
                W[i] = Integer.parseInt(st2.nextToken());
            }
            
            long maxSum = maximumSum(C, W, N);
            System.out.println(maxSum);
        }
        
        br.close();
	}
	
	
	public static long maximumSum(int[] C, int[] W, int N) {
	    HashSet<Integer> set = new HashSet<>();
	    
	    int left = 0;
	    int sum = 0;
	    int maxSum = Integer.MIN_VALUE;
	    
	    for (int right = 0; right < N; right++) {
	        
	        while (set.contains(C[right])) {
	            sum -= W[left];
	            set.remove(C[left]);
	            left++;
	        }
	        
	        set.add(C[right]);
	        sum += W[right];
	        
	        maxSum = Math.max(maxSum, sum);
	    }
	    
	    return (long) maxSum;
	}
}
