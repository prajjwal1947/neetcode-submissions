class Solution {
    List<List<Integer>>ansList= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        helperFunction(new ArrayList<>(),nums,target,0,0);
        return ansList;
    }

    public void  helperFunction(List<Integer>list,int []nums,int target,int sum,int index){
      
      if(sum>target){
        return;
      }
       if(sum==target){
        ansList.add(new ArrayList(list));
        return;
       }
       for(int i=index;i<nums.length;i++){
         sum=sum+nums[i];
         list.add(nums[i]);
          helperFunction(list,nums,target,sum,i);
           list.remove(list.size()-1);
           sum=sum-nums[i];
          helperFunction(list,nums,target,sum,i+1);
          return;
       }
    }
}
