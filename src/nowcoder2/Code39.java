package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/2 17:39
 */
public class Code39 {
    public static void main(String[] args) {

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
