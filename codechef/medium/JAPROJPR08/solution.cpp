
        // Take user input
        System.out.print("Select the operation: ");
        int userChoice = scanner.nextInt();

        // Process the user's choice
        String value = calculatorFunction(userChoice);
        System.out.println(value);

        // Close the scanner
        scanner.close();
    }
}


        // Display the calculator menu
        System.out.println(calculatorDisplay());
        Scanner scanner = new Scanner(System.in);
        // Create a Scanner object for input
    public static void main(String[] args) {