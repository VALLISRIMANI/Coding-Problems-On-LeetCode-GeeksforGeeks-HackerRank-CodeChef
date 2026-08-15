// Update the code below to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		//Update your code below this line to solve the problem
		for(int i=0; i<t; i++)
        {
            int x = read.nextInt();
            
            int y = 2 * x * 5;
            System.out.println(y);
        }
	}
}