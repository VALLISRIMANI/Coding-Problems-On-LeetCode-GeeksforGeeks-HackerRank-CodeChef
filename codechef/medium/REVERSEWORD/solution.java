public static String reverseWords(String s) {
    //write code here...
    String[] words = s.trim().split("\\s+");
    
    int i = 0, j = words.length - 1;
    
    while (i < j) {
        String temp = words[i];
        words[i++] = words[j];
        words[j--] = temp;
    }
    
    StringBuilder sb = new StringBuilder();
    for (int k = 0; k < words.length; k++) {
        if (k == words.length - 1) {
            sb.append(words[k]);
        } else {
            sb.append(words[k]).append(" ");
        }
    }
    
    return sb.toString();
}