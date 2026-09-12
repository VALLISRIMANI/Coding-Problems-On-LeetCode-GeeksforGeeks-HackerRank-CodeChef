public static String sortByFrequency(String s) {
    //write your code here...
    HashMap<Character, Integer> freq = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }
    
    List<Character> chars = new ArrayList<>(freq.keySet());
    Collections.sort(chars, (a, b) -> {
        int fa = freq.get(a);
        int fb = freq.get(b);
        
        if (fa != fb) {
            return fb - fa;
        }
        
        return a - b;
    });
    
    StringBuilder result = new StringBuilder();
    for (char c : chars) {
        int count = freq.get(c);
        for (int i = 0; i < count; i++) {
            result.append(c);
        }
    }

    return result.toString();
}