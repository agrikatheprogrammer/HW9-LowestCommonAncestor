public class IterativeSolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        int max = Math.max(a.val, b.val);
        int min = Math.min(a.val, b.val);
        while (max<root.val||min>root.val) {
            root=root.val<min?root.right:root.left;
        }
        return root;
    }

}
