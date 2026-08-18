import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                
                System.out.println((a * 7) - b);
            }
        }
        
        scanner.close();
	}
}
