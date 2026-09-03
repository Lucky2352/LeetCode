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
    Map<Integer, List<Integer>> map = new TreeMap<>();
    public void check(TreeNode root, int row, int col) {
        if (root == null) return;
        if (!map.containsKey(col)) {
            map.put(col, new ArrayList<>());
        }
        map.get(col).add(root.val);
        Collections.sort(map.get(col));
        check(root.left, row + 1, col - 1);
        check(root.right, row + 1, col + 1);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        check(root, 0, 0);
        for (List<Integer> list : map.values()) {
            ans.add(list);
        }
        return ans;
    }
}