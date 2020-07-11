package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/2 18:00
 */
public class Code40 {
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
        treeNode4.left=treeNode6;
//        treeNode3.right=treeNode7;
        Code40 code40=new Code40();
        boolean f=code40.IsBalanced_Solution(treeNode1);
        System.out.println(f);
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null){
            return true;
        }
        if (root.left==null&&root.right==null){
            return true;
        }
        boolean f1=true;
        boolean f2=true;
        if (root.left!=null) {
            f1=IsBalanced_Solution(root.left);
        }
        if (root.right!=null) {
            f2=IsBalanced_Solution(root.right);
        }
        if(f1&&f2){
            int rightDeep= 0;
            if (root.right!=null){
                rightDeep=TreeDepth(root.right);
            }
            int leftDeep=0;
            if (root.left!=null){
                leftDeep= TreeDepth(root.left);
            }
            if (rightDeep-leftDeep>1||leftDeep-rightDeep>1){
                return false;
            }else {
                return true;
            }
        }
        return false;
    }
    public int TreeDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }
        int maxRoot=0;
        if (root.left!=null){
            maxRoot=TreeDepth(root.left);
        }
        if (root.right!=null){
            int rightMax=TreeDepth(root.right);
            if (rightMax>maxRoot){
                maxRoot=rightMax;
            }
        }
        maxRoot=maxRoot+1;
        return maxRoot;
    }
}
