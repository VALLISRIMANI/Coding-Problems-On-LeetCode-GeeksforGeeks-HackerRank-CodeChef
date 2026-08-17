// Update the '_' in the code below to solve this problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		// loop through each test case for its inputs
		for(int i=0; i<t; i++)
		{
		    // Accept 2 integers inputs.
    		int a = read.nextInt();
    		int b = read.nextInt();

    		System.out.print((a - b) + " ");
            System.out.print((b - a) + " ");
            System.out.print((Math.abs(a - b)) + " ");
            System.out.println(Math.abs(b - a));
		}
	}
}