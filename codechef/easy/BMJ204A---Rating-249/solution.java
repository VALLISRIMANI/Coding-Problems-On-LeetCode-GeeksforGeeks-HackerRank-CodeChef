import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		//Update your code below this line to solve the problem
		{
    	    int n = read.nextInt();
    	    System.out.println(15 * n);
		}
		
		read.close();
	}
}