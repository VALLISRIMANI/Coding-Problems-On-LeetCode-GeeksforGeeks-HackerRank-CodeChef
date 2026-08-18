import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                
                // Find the minimum points needed for either Alice or Bob to reach 7
                int ans = Math.min(7 - a, 7 - b);
                
                System.out.println(ans);
            }
        }
        
        scanner.close();
    }
}