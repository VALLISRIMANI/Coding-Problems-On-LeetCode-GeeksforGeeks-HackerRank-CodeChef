public static String longestCommonPrefix(String[] strs) {
    //write your code here...
    Arrays.sort(strs);
    
    String word1 = strs[0], word2 = strs[strs.length - 1];
    
    int i = 0, j = Math.min(word1.length(), word2.length());
    
    while (i < j) {
        if (word1.charAt(i) != word2.charAt(i)) {
            break;
        }
        
        i++;
    }
    
    return word1.substring(0, i);
}