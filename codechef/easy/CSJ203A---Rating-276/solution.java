import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		// Update your code below this line solve the problem
    		System.out.println(x > 100 ? x - 10 : x);
		}
	}
}