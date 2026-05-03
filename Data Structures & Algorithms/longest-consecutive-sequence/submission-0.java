class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>sets = new HashSet<>();
        int maxLength=0;
        for(int num :nums){
          sets.add(num);
        }
       
       for(int num :sets){
         
         if(!sets.contains(num-1)){
            int cur=num;
            int count=1;

            while(sets.contains(cur+1)){
                 cur++;
                 count++;
            }

            maxLength = Math.max(maxLength, count);
         }
       }

       return maxLength;

    }
}
