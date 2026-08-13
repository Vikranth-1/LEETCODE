/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return creBst(nums,0,nums.length-1);
    }
    TreeNode creBst(int[] nums,int le,int ri){
        if(le>ri) return null;
        int mid=le+(ri-le)/2;
        TreeNode temp=new TreeNode(nums[mid]);
        temp.left=creBst(nums,le,mid-1);
        temp.right=creBst(nums,mid+1,ri);
        return temp;
    }
}
