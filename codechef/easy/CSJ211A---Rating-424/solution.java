// The code below is incorrect. Debug this code to solve this problem
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
    		
    		int total_score = a+b+c;
    		int minimum_score = Math.min(a, Math.min(b, c));
    		
    		if(total_score>=100 && minimum_score>=10){
    		    System.out.println("PASS");
    		}
    		else{
    		    System.out.println("FAIL");
    		}
		}
	}
}