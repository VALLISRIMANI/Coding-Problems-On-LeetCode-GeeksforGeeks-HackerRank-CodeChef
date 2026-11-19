class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String review1 = "Excellent Product";
        String review2 = "excellent product";
        double productPrice = 249.99;
        int productId = 1024;

        // Comparing reviews using equalsIgnoreCase()
        boolean isMatch = review1.equalsIgnoreCase(review2);

        // Printing details
        System.out.println("Product ID: " + productId);
        System.out.println("Product Price: $" + productPrice);
        System.out.println("Review Match: " + isMatch);
    }
}
