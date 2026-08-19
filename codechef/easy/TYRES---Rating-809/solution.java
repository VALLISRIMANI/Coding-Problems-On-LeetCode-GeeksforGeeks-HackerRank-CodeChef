import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		// Read the number of test cases
		if (scanner.hasNextInt()) {
			int t = scanner.nextInt();
			
			while (t-- > 0) {
				int n = scanner.nextInt();
				
				// If the remainder when divided by 4 is 2, 
				// it means we have enough leftover tyres to make 1 bike.
				if (n % 4 == 2) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		
		scanner.close();
	}
}