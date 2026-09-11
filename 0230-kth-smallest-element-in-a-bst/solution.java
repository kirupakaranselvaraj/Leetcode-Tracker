class Solution {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return -1;
        int left = kthSmallest(root.left, k);
        if (count == k) return left;
        count++;
        if (count == k) return root.val;
        return kthSmallest(root.right, k);
    }
}
