class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        
        int maxWater=0;

        while(start<end){
           int totalWater=0;  
            if(heights[start]<heights[end]){
               totalWater=(end-start)*heights[start];
               maxWater=Math.max(totalWater,maxWater);
               start++;
            }
            else{
                totalWater=(end-start)*heights[end];
               maxWater=Math.max(totalWater,maxWater);
               end--;
            }
        }
        
        return maxWater;

    }
}
