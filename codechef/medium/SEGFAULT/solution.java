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
            int[][] arr = new int[N + 1][2];
            
            for (int i = 1; i <= N; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            
            List<Integer> result = new ArrayList<>();
            
            for (int i = 1; i <= N; i++) {
                int count = 0;
                
                for (int j = 1; j <= N; j++) {
                    int l = arr[j][0];
                    int r = arr[j][1];
                    
                    if (i != j && (l >= i && i <= r)) {
                        count++;
                    }
                }
                
                if (count > 0) {
                    result.add(i);
                }
            }
            
            System.out.println(result.size());
            Collections.sort(result);
            
            for (int num : result) {
                System.out.println(num);
            }
        }
        
        sc.close();
	}
}
