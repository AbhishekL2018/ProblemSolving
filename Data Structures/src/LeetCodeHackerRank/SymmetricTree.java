package LeetCodeHackerRank;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        System.out.println(SymmetricTree.isSymmetric(root));
    }
    public static boolean isSymmetric(TreeNode root) {
        return isMirrot(root,root);
    }

    private static boolean isMirrot(TreeNode root, TreeNode root1) {
        if(root == null && root1 == null) return true;
        if(root == null || root1 == null) return false;
        return (root.val == root1.val) && isMirrot(root.left,root1.right) && isMirrot(root.right,root1.left);
    }
}
