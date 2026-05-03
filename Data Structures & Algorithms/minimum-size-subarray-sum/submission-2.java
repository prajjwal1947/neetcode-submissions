class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int curSum = 0;

        while (end < nums.length) {
            curSum += nums[end];

            while (curSum >= target) {
                minSize = Math.min(minSize, end - start + 1);
                curSum -= nums[start];
                start++;
            }

            end++;
        }

        if (minSize == Integer.MAX_VALUE) {
            return 0;
        }

        return minSize;
    }
}