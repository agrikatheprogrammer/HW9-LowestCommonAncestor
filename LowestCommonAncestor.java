public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null) {
            return null;
        }

        // If the root is one of a or b, then it is the LCA
        if (root == a || root == b) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, a, b);
        TreeNode right =lowestCommonAncestor(root.right, a, b);

        // If both TreeNodes lie in left or right then their LCA is in left or right,
        // Otherwise root is their LCA
        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }
}
