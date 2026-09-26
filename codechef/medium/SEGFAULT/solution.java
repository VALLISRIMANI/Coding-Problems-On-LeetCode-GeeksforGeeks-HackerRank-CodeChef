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
            
            int[] temp = new int[N + 1];
            
            for (int i = 1; i <= N; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                
                for (int t = arr[i][0]; t <= arr[i][1]; t++) {
                    temp[t]++;
                }
            }
            
            List<Integer> result = new ArrayList<>();
            
            for (int i = 1; i <= N; i++) {
                if (temp[i] > 0 && (i < arr[i][0] || i > arr[i][1])) {
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
