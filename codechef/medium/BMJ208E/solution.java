// Update the '_' below to solve the problem
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
    		int a = read.nextInt();
    		
    		int chef_chocolates = a;
            int chefina_chocolates = n - a;
            int diff = Math.abs(chefina_chocolates - chef_chocolates);

    		System.out.println(diff);
		}
	}
}