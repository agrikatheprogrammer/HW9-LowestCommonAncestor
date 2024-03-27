public class Main {
    public  static void main(String[] args) {
        TreeNode c=new TreeNode(1);
        TreeNode f=new TreeNode(9);
        TreeNode g=new TreeNode(5);
        TreeNode a = new TreeNode(3,c, null);
        TreeNode b = new TreeNode(8, g, f);
        TreeNode root = new TreeNode(4, a, b);
        RecursiveSolution recursive=new RecursiveSolution();
        IterativeSolution iterative=new IterativeSolution();
        System.out.println(recursive.lowestCommonAncestor(root,f,g).val);
        System.out.println(iterative.lowestCommonAncestor(root,f,g).val);

    }

}
