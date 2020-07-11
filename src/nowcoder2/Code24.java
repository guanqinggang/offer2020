package nowcoder2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author guanqinggang
 * @date 2020/5/29 21:06
 */
public class Code24 {
    public static void main(String[] args) {
            Code24 code24=new Code24();
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
            ArrayList list=code24.FindPath(treeNode1,19);
            System.gc();
    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            if (root==null){
                return null;
            }
            Stack stack=new Stack();
            ArrayList arrayList=new ArrayList();
            FindPath( root, stack, arrayList,0, target);
           return arrayList;
    }

    public void FindPath(TreeNode root,Stack stack,ArrayList list, int currentSum,int target) {
             currentSum=currentSum+root.val;
             stack.push(root.val);
             boolean f=(root.left==null&&root.right==null);
             if (currentSum==target&&f){
                 ArrayList list1=new ArrayList();
                 Iterator it=stack.iterator();
                 while (it.hasNext()){
                     list1.add(it.next());
                 }
                 list.add(list1);
             }
             if(root.left!=null){
                 FindPath( root.left, stack, list,  currentSum, target);
             }
            if(root.right!=null){
                FindPath( root.right, stack, list,  currentSum, target);
            }
            stack.pop();
    }
}
