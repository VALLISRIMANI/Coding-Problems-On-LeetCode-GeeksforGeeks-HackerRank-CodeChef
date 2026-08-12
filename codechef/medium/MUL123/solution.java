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

            if (N % 3 == 0) {
                System.out.println(0);
            } else if (N % 5 == 0) {
                System.out.println(2);
            } else {
                if (N % 3 == 2) {
                    System.out.println(1);
                } else {
                    System.out.println(1);
                }
            }
        }

        sc.close();
	}
}
