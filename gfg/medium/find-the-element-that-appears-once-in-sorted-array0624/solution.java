class Solution {
    int single(int[] arr) {
        // code here
        return search(arr, 0, arr.length - 1);
    }
    
    int search(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low];
        }
        
        int mid = low + (high - low) / 2;
        if (mid % 2 != 0) {
            mid--;
        }
        
        if (arr[mid] == arr[mid + 1]) {
            return search(arr, mid + 2, high);
        }
        
        return search(arr, low, mid);
    }
}