class Solution {
      public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxSize=0;
        int sSize=s.length();
        Map<Character,Integer>map = new HashMap<>();
        if(s==" ")return 1;
        while(end<sSize){
            if(map.containsKey(s.charAt(end))){

                maxSize= Math.max(maxSize,(end-start));
                map.clear();
                start=end;
                map.put(s.charAt(end),end);
            }

                maxSize= Math.max(maxSize,end-start);
                map.put(s.charAt(end),end);
                end++;
            
        }

        return maxSize;
    }
}
