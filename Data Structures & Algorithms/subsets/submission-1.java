class Solution {
    List<List<Integer>>Anslist= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
     helperFunction(new ArrayList<>() ,nums,0);
     return Anslist;
    }

    public void helperFunction(List <Integer>list,int nums[],int index){
        Anslist.add(new ArrayList(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            helperFunction(list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
