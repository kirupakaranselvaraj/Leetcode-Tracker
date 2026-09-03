class NumArray {
    int[] p;
    public NumArray(int[] nums) {
        p = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++)
            p[i + 1] = p[i] + nums[i];
    }
    public int sumRange(int left, int right) {
        return p[right + 1] - p[left];
    }
}
