

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ansList = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String newStr = strs[i];
            char[] chars = newStr.toCharArray();
            Arrays.sort(chars);
            newStr = new String(chars);

            if (map.containsKey(newStr)) {
                List<String> newList = map.get(newStr);
                newList.add(strs[i]);
            } else {
                map.put(newStr, new ArrayList<>());
                map.get(newStr).add(strs[i]);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> list = entry.getValue();
            ansList.add(new ArrayList<>(list));
        }

        return ansList;
    }
}
