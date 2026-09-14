public static int romanToInt(String s) {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = romanValue(s.charAt(i));

            // Subtract if next numeral is bigger
            if (i + 1 < n && current < romanValue(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    // ----------------- UTILITY FUNCTION -----------------
    public static int romanValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }