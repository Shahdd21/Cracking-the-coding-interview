class Solution {
    int diff = 0 ;
    public boolean isBalanced(TreeNode root) {
        helper(root);

        if(diff == -1) return false;
        
        return true;
    }

    public int helper(TreeNode root){
        if(root == null) return 0;

        int leftH = helper(root.left);
        int rightH = helper(root.right);

        if(Math.abs(leftH-rightH) > 1) diff = -1;

        return 1+Math.max(leftH,rightH);
    }
}
