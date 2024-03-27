public class IterativeSolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max = Math.max(p.val, q.val);
        int min = Math.min(p.val, q.val);
        while (max<root.val||min>root.val) {
            root=root.val<min?root.right:root.left;
        }
        return root;
    }

}
