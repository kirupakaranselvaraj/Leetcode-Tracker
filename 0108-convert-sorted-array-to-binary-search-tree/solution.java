class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }
    TreeNode build(int[] a,int l,int r){
        if(l>r) return null;
        int m=(l+r)/2;
        TreeNode n=new TreeNode(a[m]);
        n.left=build(a,l,m-1);
        n.right=build(a,m+1,r);
        return n;
    }
}
