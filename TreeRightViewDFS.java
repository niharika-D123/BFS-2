// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class TreeRightViewDFS {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    private void dfs(TreeNode root, int level, List<Integer> result) {
        // base
        if (root == null) return;

        //logic
        if (result.size() == level) {
            result.add(root.val);
        }
        dfs(root.right, level + 1, result);
        dfs(root.left, level + 1, result);
    }
}
