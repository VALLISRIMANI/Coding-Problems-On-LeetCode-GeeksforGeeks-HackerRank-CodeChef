class Codechef {
    public static void main(String[] args) {
        // Flight details
        String flightStatus1 = "On Time";
        String flightStatus2 = "Delayed";
        int flightNumber = 1023;
        double flightDuration = 2.5;

        // Comparing flight statuses
        boolean statusMatch = flightStatus1.equals(flightStatus2);

        // Printing flight details and comparison result
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Flight Duration: " + flightDuration + " hours");
        System.out.println("Flight status match: " + statusMatch);
    }
}
