class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = nums.length;
        int start = 0;
        int end = 0;
        int curSum = 0;

        while (end < nums.length) {
            curSum = curSum + nums[end];

            if (curSum >= target) {
                while (curSum > target) {
                    curSum = curSum - nums[start];
                     minSize = Math.min(minSize, end - start+1);
                    start++;
                    
                }
            }
            end++;  
        }
        if(minSize==nums.length){
            return 0;
        }

        return minSize;  
    }
}