
class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>map= new HashMap<>();
        int maxSize=0;
        map.put(s.charAt(0),1);
        int count=0;
        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                count=map.get(s.charAt(i));
                maxSize=Math.max(count,maxSize);
            }
            else{
                if(k==0){
                    map.clear();
                }
                if(k>0){
                    count++;
                    k--;
                }

            }
        }
        return maxSize;
    }
}