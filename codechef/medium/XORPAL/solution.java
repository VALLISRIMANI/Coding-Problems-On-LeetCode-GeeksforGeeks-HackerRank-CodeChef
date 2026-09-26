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
            String S = sc.next();
            
            System.out.println(isXORPalindrome(N, S) ? "YES" : "NO");
        }
        
        sc.close();
	}
	
	public static boolean isXORPalindrome(int N, String S) {
	    HashMap<Character, Integer> map = new HashMap<>();
	    
	    for (char ch : S.toCharArray()) {
	        map.put(ch, map.getOrDefault(ch, 0) + 1);
	    }
	    
	    int count = 0;
	    for (int value : map.values()) {
	        if (value % 2 != 0) {
	            count++;
	        }
	    }
	    
	    return count <= 1;
	}
}
