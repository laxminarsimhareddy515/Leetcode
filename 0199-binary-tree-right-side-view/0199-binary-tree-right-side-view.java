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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res = new ArrayList<Integer>();
        rightSideView(root,res,0);
        return res;
        
    }
    
    public void rightSideView(TreeNode cur,List<Integer> res , int height){
        
        if(cur==null){
            return;
        }
        if(height==res.size()){
            res.add(cur.val);
        }
        rightSideView(cur.right,res,height+1);
        rightSideView(cur.left,res,height+1);
    }
}