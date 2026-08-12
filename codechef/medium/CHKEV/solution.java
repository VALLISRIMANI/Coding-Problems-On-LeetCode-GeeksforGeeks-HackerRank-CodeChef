import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        if (L % 2 == 0 || R % 2 == 0 || L < R) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
	}
}
