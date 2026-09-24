class Solution {
    public int countTriplet(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        int count = 0;
        
        for (int k = n - 1; k >= 2; k--) {
            if (k < n - 1 && arr[k] == arr[k + 1]) {
                continue;
            }
            
            int i = 0;
            int j = k - 1;
            
            while (i < j) {
                int sum = arr[i] + arr[j];
                
                if (sum == arr[k]) {
                    count++;
                    
                    int left = arr[i];
                    int right = arr[j];
                    
                    while (i < j && arr[i] == left) {
                        i++;
                    }
                    
                    while (i < j && arr[j] == right) {
                        j--;
                    }
                } else if (sum < arr[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        
        return count;
    }
}