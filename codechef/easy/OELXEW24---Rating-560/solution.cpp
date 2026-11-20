class Codechef {
    public static void main(String[] args) {
        // Arrays to store default employee data
        int[] intArray = new int[5];          // Default: 0
        double[] doubleArray = new double[5]; // Default: 0.0
        boolean[] booleanArray = new boolean[5]; // Default: false

        // Display default values without loops or toString
        System.out.println("IDs: " + intArray[0] + ", " + intArray[1] + ", " + intArray[2]);
        System.out.println("Salaries: " + doubleArray[0] + ", " + doubleArray[1] + ", " + doubleArray[2]);
        System.out.println("Active Status: " + booleanArray[0] + ", " + booleanArray[1] + ", " + booleanArray[2]);
    }
}
