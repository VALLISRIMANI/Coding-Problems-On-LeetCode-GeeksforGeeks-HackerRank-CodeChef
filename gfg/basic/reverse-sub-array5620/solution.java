class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        // code here
        l--;
        r--;
        
        while (l < r) {
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);
            l++;
            r--;
        }
        
        return arr;
    }
}