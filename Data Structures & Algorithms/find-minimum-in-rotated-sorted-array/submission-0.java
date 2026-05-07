class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end =nums.length-1;
        while(start<end){
            int mid=(start+end+1)/2;

            if(nums[start]>nums[end]){
                if(nums[start]<nums[mid]){
                    start=mid+1;
                }
                else {
                    start=mid-1;
                }

            }
            else{
                end=mid-1;
            }
        }
        return nums[start];
    }
}
