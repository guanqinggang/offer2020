package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/5/30 12:30
 */
public class Code26 {
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
        Code26 code26=new Code26();
        TreeNode treeNode=code26.Convert(treeNode1);
        System.gc();
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null){
            return null;
        }
        TreeNode lastNode=null;
        lastNode=Convert(pRootOfTree, lastNode);
        while (lastNode.left!=null){
            lastNode=lastNode.left;
        }
        return lastNode;
    }


    public TreeNode Convert(TreeNode pRootOfTree,TreeNode lastNode) {
        TreeNode current=pRootOfTree;
        if (current.left!=null){
            lastNode=Convert(current.left,lastNode);
        }
        if (lastNode!=null){
            lastNode.right=current;
            current.left=lastNode;
        }
        lastNode=current;

        if (current.right!=null){
            lastNode=Convert(current.right,lastNode);
        }
        return lastNode;
    }

//    public TreeNode ConvertLeft1(TreeNode pRootOfTree) {
//
//        if(pRootOfTree.left==null&&pRootOfTree.right==null){
//            return  pRootOfTree;
//        }
//        if (pRootOfTree.left!=null){
//            TreeNode left=ConvertLeft(pRootOfTree.left);
//            left.right=pRootOfTree;
//            pRootOfTree.left=left;
//        }
//        if (pRootOfTree.right!=null){
//            TreeNode right=ConvertRight(pRootOfTree.right);
//            right.left=pRootOfTree;
//            pRootOfTree.right=right;
//        }
//        return pRootOfTree;
//    }
//    public TreeNode ConvertLeft(TreeNode pRootOfTree) {
//        while ( pRootOfTree.right!=null){
//            pRootOfTree=ConvertLeft(pRootOfTree.right);
//        }
//        return pRootOfTree;
//    }
//    public TreeNode ConvertRight(TreeNode pRootOfTree) {
//        while ( pRootOfTree.left!=null){
//            pRootOfTree=ConvertLeft(pRootOfTree.left);
//        }
//        return pRootOfTree;
//    }
}
