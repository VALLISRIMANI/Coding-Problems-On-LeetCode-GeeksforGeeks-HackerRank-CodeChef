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
            int M = sc.nextInt();
            int X = sc.nextInt();

            int row = (X - 1) / M + 1;

            int fromFront = row;
            int fromBack = N - row + 1;

            System.out.println(Math.min(fromFront, fromBack));
        }

        sc.close();
	}
}
