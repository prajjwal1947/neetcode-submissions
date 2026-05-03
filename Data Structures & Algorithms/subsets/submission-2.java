class Solution {
    List<List<Integer>>anslist=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
         helperFunction(nums,0,new ArrayList<>());
         return anslist;
    }

    public void helperFunction(int []nums,int index,List<Integer>list){
        if(index>nums.length){
            return;
        }
        anslist.add(new ArrayList(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            helperFunction(nums,i+1,list);
            list.remove(list.size()-1);
            
        }
        return;
    }
}
