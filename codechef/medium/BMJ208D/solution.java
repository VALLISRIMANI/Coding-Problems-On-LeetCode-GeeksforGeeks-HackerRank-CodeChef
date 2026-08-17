// Update the code below to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		
    		int total_games = n / 30;
            int remaining_time = n % 30;

    		System.out.print(total_games + " ");
            System.out.println(remaining_time);
		}
	}
}
