package nowcoder;

import java.util.ArrayList;

/**
 * @author guanqinggang
 * @date 2020/5/23 16:25
 */
public class Code03 {
    public static void main(String[] args) {
        Code03 code03=new Code03();
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        ArrayList<Integer> list=code03.printListFromTailToHead(l1);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
    ArrayList<Integer> li=new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode!=null) {
            if (listNode.next != null) {
                printListFromTailToHead(listNode.next);
            }
            li.add(listNode.val);
        }
         return li;
    }
}
