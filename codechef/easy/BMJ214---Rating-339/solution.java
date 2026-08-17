// Try and debug this code to solve the problem!!!
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)  
		{
    		int a = read.nextInt();
    		int b = read.nextInt();
    		int c = read.nextInt();
    		
                //Declare a new variable to store the maximum of the 3 variables.
    		int maximum = Math.max(a, Math.max(b, c));

                //Declare a new variable to store the minimum of the 3 variables.
    		int minimum = Math.min(a, Math.min(b, c));
    		
    		int difference = maximum - minimum;
    		System.out.println(difference);
		}
	}
}