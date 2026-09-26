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
            
            int[] C = new int[N];
            for (int i = 0; i < N; i++) {
                C[i] = sc.nextInt();
            }
            
            int[] W = new int[N];
            for (int i = 0; i < N; i++) {
                W[i] = sc.nextInt();
            }
            
            int maxSum = maximumSum(C, W, N);
            System.out.println(maxSum);
        }
        
        sc.close();
	}
	
	
	public static int maximumSum(int[] C, int[] W, int N) {
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
	    
	    return maxSum;
	}
}
