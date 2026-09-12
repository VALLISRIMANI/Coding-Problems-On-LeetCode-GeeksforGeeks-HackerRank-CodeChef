 private static int maxNestingDepth(String s) {
     //write your code here...
     int count = 0;
     int maxDepth = Integer.MIN_VALUE;
     
     for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         
         if (ch == '(') {
             count++;
         } else if (ch == ')') {
             maxDepth = Math.max(maxDepth, count);
             count--;
         }
     }
     
     return maxDepth == Integer.MIN_VALUE ? 0 : maxDepth;
 }