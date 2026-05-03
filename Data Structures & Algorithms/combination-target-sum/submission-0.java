class Solution {
    List<List<Integer>>ansList= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        helperFunction(nums,target,0,new ArrayList<>(),0);
        return ansList;
    }

    public void  helperFunction(int [] nums,int target,int start,List<Integer>choosen,int sum){
        if(sum==target){
            ansList.add(new ArrayList<Integer>(choosen));
            return;
        }
        for(int i=start;i<nums.length;i++) {

            if (sum < target) {
                choosen.add(nums[i]);
                sum = sum + nums[i];
                helperFunction(nums, target, i, choosen, sum);
                sum = sum - nums[i];
                choosen.remove(choosen.size() - 1);
                helperFunction(nums, target, i + 1, choosen, sum);
                return;
            }
            if (sum > target) {
                return;
            }
        }
    }
}
