class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total_sum =0;
        int max_end =0;
        int min_end=0;
        int maxsum =Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int x : nums){
            total_sum+=x;
            max_end= Math.max(max_end+x,x);
            maxsum = Math.max(max_end,maxsum);
            min_end = Math.min(min_end+x,x);
            minsum=Math.min(min_end, minsum);
        }
        if(maxsum>0)
            return Math.max(maxsum, total_sum-minsum);
        return maxsum;
        
    }
}