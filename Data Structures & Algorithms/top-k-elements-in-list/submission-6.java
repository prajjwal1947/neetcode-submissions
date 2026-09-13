class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int num : map.keySet()) {
            maxHeap.add(num);
        }

        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = maxHeap.poll();
        }

        return answer;
    }
}