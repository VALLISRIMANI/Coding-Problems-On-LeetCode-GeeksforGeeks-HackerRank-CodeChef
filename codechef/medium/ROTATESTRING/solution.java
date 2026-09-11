public static boolean canRotate(String s, String goal) {
    //write your code here...
    StringBuilder sb = new StringBuilder(s);
    sb.append(s);
    
    return sb.toString().contains(goal);
}