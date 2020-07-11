package nowcoder;

import java.util.Stack;

/**
 * @author guanqinggang
 * @date 2020/5/28 21:46
 */
public class Code20 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    int min;
    public static void main(String[] args) {
        Code20 code20=new Code20();
        code20.push(3);
        code20.push(4);
        code20.push(5);
        code20.push(2);
         code20.pop();
        System.out.println(code20.min());
        System.out.println(code20.top());
        System.out.println(code20.min());
    }
    public void push(int node) {
        if (stack1.isEmpty()){
            min=node;
        }
        stack1.push(node);
        if (node<min){
            min=node;
        }
        stack2.push(min);
    }

    public void pop() {
        if (!stack1.isEmpty()){
            stack1.pop();
            stack2.pop();
            min=stack2.peek();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
       return min;
    }
}
