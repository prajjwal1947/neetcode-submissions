

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(str);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(sorted, newList);
            }
        }

        for (Map.Entry<String, List<String>> m : map.entrySet()) {
            list.add(m.getValue());
        }

        return list;
    }
}
