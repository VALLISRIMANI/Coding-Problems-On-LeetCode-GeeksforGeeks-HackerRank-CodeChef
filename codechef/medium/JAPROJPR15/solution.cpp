                System.err.println("Error: " + e.getMessage());
                Thread.currentThread().interrupt(); 
            } catch (InterruptedException e) {
                TimeUnit.SECONDS.sleep(1);
            try {

                break;
            }
        }
    }

    public static void countdownTimer(int seconds) {
        System.out.println("Counting down from " + seconds + " seconds.");
    }
}