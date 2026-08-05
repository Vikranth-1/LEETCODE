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
    int max=0,sum=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        sumAtLevel(root,0);
        return sum;
    }
    void sumAtLevel(TreeNode root,int lev){
        if(root==null) return;
        if(lev>max){
            sum=0;
            max=lev;
        }
        if(max==lev) sum+=root.val;
        sumAtLevel(root.left,lev+1);
        sumAtLevel(root.right,lev+1);
    }
}
