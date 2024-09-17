class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(0,nums.length-1,nums);
    }

    public TreeNode toBST(int st, int end, int[] nums){

       if(end < st)
          return null;

        int mid = (st+end)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(st,mid-1,nums);
        root.right = toBST(mid+1,end,nums);

        return root;
    }
