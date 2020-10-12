package Tree.BinaryTree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
}
class BinaryTree{
    public TreeNode returnNewNode(int data){
        TreeNode node = new TreeNode();
        node.data = data;
        return node;
    }

    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(TreeNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
}
public class BinaryTreeMainClass {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.returnNewNode(2);
        root.left = tree.returnNewNode(7);
        root.right = tree.returnNewNode(5);
        root.left.left = tree.returnNewNode(2);
        root.left.right = tree.returnNewNode(6);
        root.left.right.left = tree.returnNewNode(5);
        root.left.right.right = tree.returnNewNode(11);
        root.right.right = tree.returnNewNode(9);
        root.right.right.left = tree.returnNewNode(4);

        System.out.println("Inorder ---> ");
        tree.inOrder(root);
        System.out.println();
        System.out.println("Preorder ---> ");
        tree.preOrder(root);
        System.out.println();
        System.out.println("Postorder ---> ");
        tree.postOrder(root);
    }
}
