// The code below is incorrect. Debug this code to solve the problem.
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
    		int y = read.nextInt();
    		
    		int prize_top10 = 10 * x;
    		
    		int prize_11to100 = 90 * y;
    		System.out.println(prize_top10 + prize_11to100);
		}
	}
}
