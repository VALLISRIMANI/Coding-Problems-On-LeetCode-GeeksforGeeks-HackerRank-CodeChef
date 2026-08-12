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

            int total = 0;
            boolean hasOdd = false;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                total += x;

                if (x % 2 != 0) {
                    hasOdd = true;
                }
            }

            if (total % 2 == 1) {
                System.out.println(0);
            } else if (!hasOdd) {
                System.out.println(total);
            } else {
                System.out.println(total - 1);
            }
        }

        sc.close();
	}
}
