import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 1: Scanner for user input

        int[] numbers = new int[5]; // Step 2: Declare an array of size 5

        // Step 3: Take input from user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 4: Print only even numbers
        System.out.println("Even numbers from input:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close(); // Step 5: Close scanner
    }
}
