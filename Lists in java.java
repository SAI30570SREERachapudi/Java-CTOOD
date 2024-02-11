class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i, j, x = 0;
        int size = nums.size();
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    x++;
                }
            }
        }
        return x;
    }
}
