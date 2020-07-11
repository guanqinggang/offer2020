package nowcoder;

import java.util.Stack;

/**
 * @author guanqinggang
 * @date 2020/5/23 18:27
 */
public class Code05 {
    public static void main(String[] args) {
        Code05  code05=new Code05();
        code05.push(1);
        code05.push(2);
        System.out.println(code05.pop());
    }
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return   stack2.pop();
    }
}
