public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') i++;

        // If string ends after spaces
        if (i == n) return 0;

        // 2. Check sign
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // 3. Convert digits
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // 4. Clamp to 32-bit integer range
            if (sign == 1 && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * num);
    }