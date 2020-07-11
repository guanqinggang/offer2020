package nowcoder2;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author guanqinggang
 * @date 2020/5/29 11:42
 */
public class Code21 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        //int[] b={4,5,3,2,1};
        int[] b={4,3,5,1};
        Code21 code21=new Code21();

        System.out.println( code21.IsPopOrder(a,b));
    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA==null||popA==null){
            return false;
        }
        Stack<Integer> stack=new Stack<Integer>();
        int j=0;
        stack.push(pushA[j++]);
        int i=0;
        while(i<popA.length){
            int top=stack.peek();
            if(popA[i]==top){
                stack.pop();
                i++;
            }else{
                if(j<pushA.length){
                    stack.push(pushA[j++]);
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
