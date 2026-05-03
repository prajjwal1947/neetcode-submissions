class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int maxWater=0;
        int minHeight=Integer.MAX_VALUE;
        while(start<=end){
           if(heights[start]<heights[end]){
            maxWater=Math.max(maxWater,(end-start)*heights[start]);
            start++;
           }
           else{
            maxWater=Math.max(maxWater,(end-start)*heights[end]);
            end--;
           }
        }
        return maxWater;
    }
}
