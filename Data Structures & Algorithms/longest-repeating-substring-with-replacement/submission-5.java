

class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        int maxFreq = 0;
        int start = 0;
        int longestSubstring = 0;

        for (int i = 0; i < s.length(); i++) {

            char value = s.charAt(i);

            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }

         
            maxFreq = Math.max(map.get(value), maxFreq);

          
            if (((i - start) + 1) - maxFreq > k) {

                char startChar = s.charAt(start);

                map.put(startChar, map.get(startChar) - 1);

                start++;
            }

          
            longestSubstring = Math.max(
                (i - start) + 1,
                longestSubstring
            );
        }

        return longestSubstring;
    }
}