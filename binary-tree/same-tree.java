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
    public static void trav(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        trav(root.left, list);
        trav(root.right, list);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    trav(p,list1);
    trav(q,list2);
    if(list1.size() != list2.size())return false;
    for(int i = 0;i<list1.size();i++){
        if(list1.get(i) != list2.get(i))return false;
    }
    return
    }
}