package nowcoder2;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author guanqinggang
 * @date 2020/5/29 12:32
 */
public class Code22 {
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
        Code22 code22=new Code22();
        ArrayList list=code22.PrintFromTopToBottom(treeNode1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        LinkedList<TreeNode> linkedList=new LinkedList();
        ArrayList arrayList=new ArrayList();
        if (root==null){
            return null;
        }
        linkedList.offer(root);  //offer（添加队尾元素）
        while (!linkedList.isEmpty()){
            root=linkedList.poll();   // poll（访问队头元素并移除）、peek（访问队头元素）
            arrayList.add(root.val);
            if (root.left!=null){
                linkedList.offer(root.left);
            }
            if (root.right!=null){
                linkedList.offer(root.right);
            }
        }
            return arrayList;
    }
}
