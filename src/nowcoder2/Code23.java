package nowcoder2;

import com.sun.org.apache.bcel.internal.classfile.Code;

/**
 * @author guanqinggang
 * @date 2020/5/29 13:58
 */
public class Code23 {
    public static void main(String[] args) {
        Code23 code23=new Code23();
       int[] a={5,7,6,9,11,10,8};
        //int[] a={4,6,7,5};
        System.out.println(code23.VerifySquenceOfBST(a));
    }
//    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
//    如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null){
            return false;
        }
        return VerifySquenceOfBST(sequence,0,sequence.length-1);
    }
    public boolean VerifySquenceOfBST(int [] sequence,int left,int right) {
        if(left >= right)return true;
        int root =sequence[right];
        int i=left;
        for (; i < right; i++) {
            if(sequence[i]>root){

                break;
            }
        }
        int j=i;
        for (; j< right; j++) {
            if (sequence[j]<root){
              return false;
            }
        }
        return VerifySquenceOfBST(sequence,left,i-1)&&VerifySquenceOfBST(sequence,i,right-1);
    }
}
