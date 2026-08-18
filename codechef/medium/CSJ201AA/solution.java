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
    		
    		// Condition 1
            if(n%3 == 0){
                System.out.println("Divisible by 3");
            }
            else{
                System.out.println("Not divisible by 3");
            }
            
            // Condition 2
            if(n%2 != 0){
                System.out.println("Odd");
            }
            else{
                System.out.println("Even");
            }
    		
		}
	}
}