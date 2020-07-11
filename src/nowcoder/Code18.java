package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/28 21:06
 */
public class Code18 {
    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(8);
        TreeNode treeNode2=new TreeNode(6);
        TreeNode treeNode3=new TreeNode(10);
        TreeNode treeNode4=new TreeNode(5);
        TreeNode treeNode5=new TreeNode(7);
        TreeNode treeNode6=new TreeNode(9);
        TreeNode treeNode7=new TreeNode(11);

        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.left=treeNode4;
        treeNode2.right=treeNode5;
        treeNode3.left=treeNode6;
        treeNode3.right=treeNode7;
        Code18 code18=new Code18();
        code18.Mirror(treeNode1);
        System.out.println();
    }
    public void Mirror(TreeNode root) {
         if (root!=null){
            TreeNode node=root.left;
            root.left=root.right;
            root.right=node;
            if (root.right!=null){
                Mirror(root.right);
            }
            if (root.left!=null){
                Mirror(root.left);
            }
         }
    }
}
