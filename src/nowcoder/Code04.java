package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/23 16:48
 */
//输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
public class Code04 {
    public static void main(String[] args) {
        Code04 code04=new Code04();
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        TreeNode treeNode=code04.reConstructBinaryTree(pre,in);
        System.gc();
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode treeNode=reConstructBinaryTreeLisp(pre,in,0,pre.length-1,0,in.length-1);
        return treeNode;
    }
    public TreeNode reConstructBinaryTreeLisp(int [] pre,int [] in,int preStart,int preEnd,int inStart,int inEnd) {
       //根
        TreeNode rootNode=new TreeNode(pre[preStart]);
        if (preStart>=preEnd||inStart>=inEnd){
            return rootNode;
        }

        if (preStart==preEnd){
            if (inStart==inEnd&&pre[preStart]==in[inStart]){
                return rootNode;
            }
        }
        int inRoot=rootNode.val;
        int inLength=inStart;
        while (inLength<inEnd){
            if (inRoot==in[inLength]){
                break;
            }
            inLength++;
        }
        int leftLength=inLength-inStart;
       //左子树
        if (leftLength>0){
            rootNode.left=reConstructBinaryTreeLisp(pre, in,preStart+1,preStart+leftLength,inStart,inLength-1);
        }
        //右子树
        if (leftLength<preEnd-preStart){
            rootNode.right=reConstructBinaryTreeLisp(pre, in,preStart+leftLength+1,preEnd,inLength+1,inEnd);
        }

        return rootNode;
    }
}
