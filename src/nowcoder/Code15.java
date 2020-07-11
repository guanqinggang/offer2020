package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/27 23:39
 */
public class Code15 {
    public static void main(String[] args) {

        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(4);
        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(6);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        Code15 code15=new Code15();
        ListNode li=code15.ReverseList(l1);

        System.gc();
    }
    public ListNode ReverseList(ListNode head){
        if (head==null){
            return null;
        }

        return ReverseList(null,head);
    }
    public ListNode ReverseList(ListNode preNode,ListNode node){
        ListNode nextNode =null;
        ListNode head=null;
        if (node.next!=null){
            nextNode=node.next;
            node.next=preNode;
            head=ReverseList(node,nextNode);
        }else {
            node.next=preNode;
            head= node;
            return head;
        }
        return head;
    }
    public ListNode ReverseList3(ListNode head){
        if (head==null){
            return null;
        }
        ListNode preNode =null;
        ListNode nextNode =null;
        ListNode node =head;
        while (node.next!=null){
            nextNode=node.next;
            node.next=preNode;
            preNode=node;
            node=nextNode;
        }
        node.next=preNode;
        return node;
    }

    ListNode tail=null;
    public ListNode ReverseList1(ListNode head){
        if (head==null){
            return null;
        }
        ReverseList2(head);
        return tail;
    }

    public ListNode ReverseList2(ListNode node) {
        if (node.next==null){
            tail=node;
            return node;
        }
        ListNode childNode=ReverseList2(node.next);
        childNode.next=node;
        node.next=null;

        return node;
    }
}
