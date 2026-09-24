class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here    
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> added = new HashSet<>();

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : b) {
            set.add(num);
        }

        for (int num : a) {

            if (set.contains(num) && !added.contains(num)) {
                result.add(num);
                added.add(num);
            }
        }

        return result;
    }
}