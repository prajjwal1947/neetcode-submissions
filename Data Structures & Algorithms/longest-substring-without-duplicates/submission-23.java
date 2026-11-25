class Solution {
    public int lengthOfLongestSubstring(String s) {

       Map<Character, Integer> map = new HashMap<>();

            int start = 0;
            int maxValue = 0;

            for (int i = 0; i < s.length(); i++) {

                char value = s.charAt(i);

                if (map.containsKey(value)) {
                    start = Math.max(start, map.get(value) + 1);
                }

                map.put(value, i);

                maxValue = Math.max(maxValue, i - start + 1);
            }

            return maxValue;
    }
}
