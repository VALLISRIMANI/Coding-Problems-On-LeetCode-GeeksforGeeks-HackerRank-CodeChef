// The code below is incorrect. Debug the code to solve this problem
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
    		
    		if(x==y && (x>0 || y>0)){
    		    System.out.println("YES");
    		}
    		else{
    		    System.out.println("NO");
    		}
		}
	}
}
