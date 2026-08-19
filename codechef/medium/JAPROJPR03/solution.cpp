    }

    // Method to run the guessing game
    public static void runGuess() {
        
        
        if (Math.abs(number - guess) <= 10) return "Hot";
        if (number == guess) return "Right";
    public static String giveHint(int number, int guess) {
    // Method to give a hint based on the user's guess
    }

        return rand.nextInt(100) + 1;  // Generate a random number between 1 and 100
        Random rand = new Random();
    public static int getRandomNumber() {
    // Method to generate a random number between 1 and 100

public class Codechef {
        int secretNumber = getRandomNumber();
        return "Cold";