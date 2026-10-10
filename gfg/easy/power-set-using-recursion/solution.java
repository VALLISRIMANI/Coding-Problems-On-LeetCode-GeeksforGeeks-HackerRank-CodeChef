class Solution {
    public ArrayList<String> powerSet(String s) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        helper(0, s, "", result);
        return result;
    }
    
    private void helper(int idx, String s, String curr, List<String> result) {
        if (idx == s.length()) {
            result.add(curr);
            return;
        }
        
        helper(idx + 1, s, curr + s.charAt(idx), result);
        
        helper(idx + 1, s, curr, result);
    }
}
