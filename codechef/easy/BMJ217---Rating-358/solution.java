// The code below is incorrect. Debug this code to solve the problem
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
    		int z = read.nextInt();
    		
    		// y people move out of the town
    		int total_population = x - y;
    		
    		total_population = total_population + z;
    		System.out.println(total_population);
		}
	}
}