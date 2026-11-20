class Codechef {
    public static void main(String[] args) {
        // Static Initialization: Expenses in specific categories
        double[] expenses = {2000.50, 1500.75, 800.25, 1200.00, 500.00}; // Rent, groceries, utilities, travel, others

        System.out.println("Rent Expense: " + expenses[0]);
        System.out.println("Grocery Expense: " + expenses[1]);

        // Dynamic Initialization: Add expenses later
        double[] newExpenses = new double[3];
        newExpenses[0] = 100.00; // Internet bill
        newExpenses[1] = 150.00; // Gym membership
        newExpenses[2] = 75.50;  // Subscriptions

        System.out.println("Internet Bill: " + newExpenses[0]);
        System.out.println("Gym Membership: " + newExpenses[1]);
    }
}
