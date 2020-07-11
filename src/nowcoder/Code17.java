package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/28 20:24
 */
public class Code17 {
    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(1);
        TreeNode treeNode4=new TreeNode(1);
        TreeNode treeNode5=new TreeNode(1);
        TreeNode treeNode6=new TreeNode(1);

    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1==null||root2==null){
            return false;
        }
        boolean result =false;
        if (root1.val==root2.val){
            result=DoesTree1HasTree2(root1,root2);
        }
        if (!result){
            result= HasSubtree(root1.left,root2);
        }
        if (!result){
            result=HasSubtree(root1.right,root2);
        }
        return result;
    }

    private boolean DoesTree1HasTree2(TreeNode root1,TreeNode root2) {
        if (root2==null){
            return true;
        }
        if (root1==null){
            return false;
        }
        if (!(root1.val==root2.val)){
            return false;
        }
        return DoesTree1HasTree2(root1.left,root2.left)&&DoesTree1HasTree2(root1.right,root2.right);

    }
}
