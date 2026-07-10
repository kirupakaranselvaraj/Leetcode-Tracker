class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] visited = new boolean[nums.length + 1];
        for (int num : nums) {
            visited[num] = true;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!visited[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
