

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int maxSize = 0;
        int start = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (map.containsKey(current) && map.get(current) >= start) {
                start = map.get(current) + 1;
            }

            map.put(current, i);

            maxSize = Math.max(maxSize, i - start + 1);
        }

        return maxSize;
    }
}
