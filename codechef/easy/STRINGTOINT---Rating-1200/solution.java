public static long stringToNumber(String str) {
    long num = 0;
    
    for (int i = 0; i < str.length(); i++) {
        num = num * 10 + (str.charAt(i)) - '0';
    }
    
    return num;
}
