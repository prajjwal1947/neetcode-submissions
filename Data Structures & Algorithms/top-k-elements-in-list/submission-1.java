class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();

            if (pq.size() < k) {
                pq.add(num);
            } else if (map.get(num) > map.get(pq.peek())) {
                pq.poll();
                pq.add(num);
            }
        }

        int[] ans = new int[k];

        int i = 0;
        while (!pq.isEmpty()) {
            ans[i++] = pq.poll();
        }

        return ans;
    }
}