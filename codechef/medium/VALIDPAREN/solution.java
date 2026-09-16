public static int minAddToMakeValidNaive(String s) {
        StringBuilder sb = new StringBuilder(s);
        int moves = 0;

        // Keep scanning until no more changes
        while (sb.length() > 0) {
            boolean removed = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == '(' && sb.charAt(i + 1) == ')') {
                    sb.delete(i, i + 2); // remove the valid pair
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                // If no pairs found, we must insert brackets
                moves += sb.length();
                break;
            }
        }
        return moves;
    }

  