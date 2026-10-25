class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int states = minutesToTest / minutesToDie + 1;
        return (int)Math.floor(
                Math.log(buckets) / Math.log(states)
        );
    }
}