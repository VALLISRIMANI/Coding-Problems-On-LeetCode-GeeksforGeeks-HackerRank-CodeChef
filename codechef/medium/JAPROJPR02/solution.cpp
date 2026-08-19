

        int min = 1; // Define the minimum range
        int max = 100; // Define the maximum range

        // Generate a random number in the range [min, max]
        int randNumber = random.nextInt((max - min) + 1) + min;
        return randNumber;
    }

    public static void main(String[] args) throws Exception {
        // Generate and print random number
        System.out.println("Random Number: " + getRandomNumber());
        Random random = new Random();

    }
}
