class Solution {
    public int lengthOfLongestSubstring(String s) {
         int maxSize=1;
         int start=0;
          Map<Character,Integer>map = new HashMap<>();
          for(int i=0;i<s.length();i++){
             if(map.containsKey(s.charAt(i))){
                start=map.get(s.charAt(i));
                start++;
                // map.remove(s.charAt(start));
                // start++;
             }
             map.put(s.charAt(i),i);
             maxSize=Math.max(i-start+1,maxSize);
          }
          return maxSize;
    }
}
