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
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(isAnagrams(s1, s2) ? "YES" : "NO");
        }
        
        sc.close();
	}
	
	public static boolean isAnagrams(String s1, String s2) {
	    HashMap<Character, Integer> map1 = new HashMap<>();
	    for (char ch : s1.toCharArray()) {
	        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
	    }
	    
	    HashMap<Character, Integer> map2 = new HashMap<>();
	    for (char ch : s2.toCharArray()) {
	        map2.put(ch, map2.getOrDefault(ch, 0) + 1);
	    }
	    
	    return map1.equals(map2);
	}
}
