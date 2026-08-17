// Update the '_' in the code below to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		// Always first check if the problem has test cases
		int t = read.nextInt();
		// loop through each test case for its inputs
		for(int i=0; i<t; i++)
		{
		    // Accept 2 integers inputs.
    		int a = read.nextInt();
    		int b = read.nextInt();
    		
    		// Declare a new variable to store the count of burgers
    		int burgers = Math.min(a, b); 
    		
    		// print the desired output for each test case
    		System.out.println(burgers);
		}
	}
}