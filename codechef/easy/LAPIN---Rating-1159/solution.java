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
            String str = sc.next();
            System.out.println(isLapindrome(str) ? "YES" : "NO");
        }
        
        sc.close();
	}
	
	public static boolean isLapindrome(String str) {
	    int n = str.length();
	    
	    HashMap<Character, Integer> map1 = new HashMap<>();
	    for (int i = 0; i < n / 2; i++) {
	        char ch = str.charAt(i);
	        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
	    }
	    
	    int start = n % 2 == 0 ? n / 2 : (n / 2) + 1;
	    HashMap<Character, Integer> map2 = new HashMap<>();
	    for (int i = start; i < n; i++) {
	        char ch = str.charAt(i);
	        map2.put(ch, map2.getOrDefault(ch, 0) + 1);
	    }
	    
	    return map1.equals(map2);
	}
}
