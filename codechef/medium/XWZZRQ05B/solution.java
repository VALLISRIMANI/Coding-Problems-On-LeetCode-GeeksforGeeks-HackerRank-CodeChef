import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array as input
        int n = sc.nextInt();

        // Step 2: Declare array of size n
        int[] numbers = new int[n];

        // Step 3: Take array input from user
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 4: Update even elements
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = numbers[i] + 1;
            }
        }

        // Step 5: Print the updated array
        System.out.println("Updated Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        sc.close(); // Close the scanner
    }
}
